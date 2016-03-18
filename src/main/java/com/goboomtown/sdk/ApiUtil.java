package com.goboomtown.sdk;

import android.util.Base64;
import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;
import io.swagger.client.api.IssuesApi;
import io.swagger.client.api.MerchantsApi;
import io.swagger.client.api.ProvidersApi;

import javax.crypto.Mac;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/**
 * A Java API for interfacing with the underlying--auto-generated--Swagger Java client.
 */
public class ApiUtil {
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    public static final DateFormat DATE_FORMAT_API = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static {
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
        DATE_FORMAT_API.setTimeZone(TimeZone.getDefault());
    }

    private static final String BASE_PATH = "/api/v2";

    private static Mac sha256_HMAC = null;
    private static String token = null;

    /**
     * Statically initializes ApiUtil.
     *
     * This must be called before using any other static ApiUtil method.
     *
     * @param token A Boomtown Provider API Public Key
     * @param privateKey A Boomtown Provider API Private Key
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     * @throws InvalidKeyException
     */
    public static void initialize(String token, String privateKey) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        if (sha256_HMAC != null) {
            ApiUtil.sha256_HMAC.reset();
            ApiUtil.sha256_HMAC = null;
            ApiUtil.token = null;
        }

        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        sha256_HMAC.init(new javax.crypto.spec.SecretKeySpec(privateKey.getBytes("UTF-8"), "HmacSHA256"));

        ApiUtil.token = token;
        ApiUtil.sha256_HMAC = sha256_HMAC;
    }

    /**
     * Returns the ProvidersApi, used for provider-related-API calls.
     *
     * @return A new ProvidersApi instance
     */
    public static ProvidersApi getProvidersApi() {
        return new ProvidersApi() {
            ApiInvoker invoker = mkApiInvoker();

            @Override
            public ApiInvoker getInvoker() {
                return invoker;
            }
        };
    }

    /**
     * Returns the MerchantsApi, used for merchant-related-API calls.
     *
     * @return A new MerchantsApi instance
     */
    public static MerchantsApi getMerchantsApi() {
        return new MerchantsApi() {
            ApiInvoker invoker = mkApiInvoker();

            @Override
            public ApiInvoker getInvoker() {
                return invoker;
            }
        };
    }

    /**
     * Returns the IssuesApi, used for issue-related-API calls.
     *
     * @return A new IssuesAPI instance
     */
    public static IssuesApi getIssuesApi() {
        return new IssuesApi() {
            ApiInvoker invoker = mkApiInvoker();

            @Override
            public ApiInvoker getInvoker() {
                return invoker;
            }
        };
    }

    /**
     * Returns an encoded X-Boomtown-Signature.
     */
    private static String encode(String data) throws Exception {
        return Base64.encodeToString(sha256_HMAC.doFinal(data.getBytes("UTF-8")), Base64.DEFAULT);
    }

    /**
     * @return A new ApiClient instance which handles Boomtown api/v2 authentication
     */
    private static ApiInvoker mkApiInvoker() {
        if (sha256_HMAC == null || token == null) {
            throw new IllegalStateException("ApiUtil.initialize() required");
        }

        return new ApiInvoker() {
            @Override
            public String invokeAPI(String host, String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType) throws ApiException {
                String dt = DATE_FORMAT.format(new Date());

                headerParams.put("X-Boomtown-Date", dt);
                headerParams.put("X-Boomtown-Token", token);

                try {
                    StringBuilder b = new StringBuilder();
                    b.append("?");
                    //noinspection Duplicates
                    if (queryParams != null){
                        for (Pair queryParam : queryParams){
                            if (!queryParam.getName().isEmpty()) {
                                b.append(escapeString(queryParam.getName()));
                                b.append("=");
                                b.append(escapeString(queryParam.getValue()));
                                b.append("&");
                            }
                        }
                    }
                    headerParams.put("X-Boomtown-Signature", encode(BASE_PATH + path + b.substring(0, b.length() - 1) + ':' + dt));
                } catch (Exception e) {
                    throw new ApiException(0, e.getMessage());
                }

                return super.invokeAPI(host, path, method, queryParams, body, headerParams, formParams, contentType);
            }
        };
    }
}
