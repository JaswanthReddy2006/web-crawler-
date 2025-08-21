package org.example;

class WebErrorHandler {
    void errorhandle(int statusCode, String url) {
        String prefix = "[" + url + "] ";

        if (statusCode == 200) {
            System.out.println(prefix + "OK (200) - Request succeeded\n\n");
        }
        else if (statusCode == 201) {
            System.out.println(prefix + "Created (201) - New resource created\n\n");
        }
        else if (statusCode == 301) {
            System.out.println(prefix + "Moved Permanently (301) - Redirect to new URL\n\n");
        }
        else if (statusCode == 400) {
            System.out.println(prefix + "Bad Request (400) - Invalid syntax\n\n");
        }
        else if (statusCode == 401) {
            System.out.println(prefix + "Unauthorized (401) - Authentication required\n\n");
        }
        else if (statusCode == 403) {
            System.out.println(prefix + "Forbidden (403) - Access denied\n\n");
        }
        else if (statusCode == 404) {
            System.out.println(prefix + "Not Found (404) - Resource missing\n\n");
        }
        else if (statusCode == 408) {
            System.out.println(prefix + "Request Timeout (408) - Server took too long\n\n");
        }
        else if (statusCode == 429) {
            System.out.println(prefix + "Too Many Requests (429) - Rate limit exceeded\n\n");
        }
        else if (statusCode == 500) {
            System.out.println(prefix + "Internal Server Error (500)\n\n");
        }
        else if (statusCode == 502) {
            System.out.println(prefix + "Bad Gateway (502) - Invalid response from upstream server\n\n");
        }
        else if (statusCode == 503) {
            System.out.println(prefix + "Service Unavailable (503) - Server overloaded/down\n\n");
        }
        else if (statusCode == 504) {
            System.out.println(prefix + "Gateway Timeout (504) - Server didn’t respond in time\n\n");
        }
        else {
            System.out.println(prefix + "Unknown Error (" + statusCode + ")\n\n");
        }
    }
}
