# cloud-sdk-android: Boomtown Provider API (Android)
Example Usage SDK for the Boomtown Cloud API.

## Overview
Boomtown provides a Cloud API SDK to support providers needing code access to our data layer.

Authentication is used using a pre-shared key and secret, which is generated in our Admin Portal.

## Getting Started
To get started:
 - Clone this repository
 - Follow the *Example Usage* section to import the module into your existing Android project
 - Generate API keys from the Boomtown Admin Portal
 - Configure the API keys in `ApiExample`
 - Review examples in `ApiExample`

## API Key Generation
To generate an API access token and private-key:
 - Log onto the Admin Portal (https://admin.goboomtown.com)
 - Click Providers in the left menu
 - Find your provider in the list
 - Double click your provider
 - Click API Settings, near the button of the configuration panel
 - Select Sandbox or Live, depending on the state of development
 - Click Re-Generate
 - Copy the access token and private-key, as provided in the pop-up dialog

## Android SDK Configuration
Prior to using the API, you must configure the Java sources with the generated access token and private-key:
 - Follow the *Example Usage* section, for importing the project into your existing Android project
 - Set `ApiExample.TOKEN` equal to the access token generated in the Admin Portal.
 - Set `ApiExample.KEY` equal to the private-key generated in the Admin Portal.

## Example Usage
To quickly get started using the Boomtown Cloud SDK:
 - Clone the source into your existing Gradle project's root directory
 - Include the module in the root project's `settings.gradle`:


    include ':boomtown-api_v2-swagger-android'
 - Include the module in each module's `build.gradle` `dependencies` block:


    dependencies {
        compile project(':boomtown-api_v2-swagger-android')
    }


Example `ApiExample` usage during a Button on-click event:

    public void onClickStart(View v) {
        AsyncTask<Void, Void, Void> task = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try {
                    ApiExample api = new ApiExample(new ApiExample.TextWriter() {
                        @Override
                        public void println(final String line) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    textView.append(line + "\n");
                                }
                            });
                        }
                    });
                    api.exampleGetProvider();

                    //api.exampleGetIssues();

                    //api.exampleAddIssueNotes();
                    //api.exampleResolveIssue();

                    //api.exampleCreateMerchant();
                } catch (Exception e) {
                    Log.e(TAG, e.getClass().getSimpleName() + ": " + e.getMessage());
                }
                return null;
            }
        };

        task.execute((Void[])null);
    }

## Examples
You must implementation your own usage of ApiExample, as describe in the *Example Usage* section.

See `ApiExample` for examples interfacing with the API.

### api.exampleGetProvider()
Dumps/outputs the provider's information, including it's associated merchants.

### api.exampleGetIssues()
By default, dumps the 5 most recent issues associated to the provider.

### api.exampleAddIssueNotes()
Adds a single note to the provider's most recent issue.

### api.exampleResolveIssue()
Sets the status of the provider's most recent issue to resolved.

### api.exampleCreateMerchant()
Creates a new merchant, location and user, and associates the new member the provider.
