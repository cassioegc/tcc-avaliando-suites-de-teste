package com.unifacisa.tcc.web.rest.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
/**
 * Utility class for HTTP headers creation.
 */
public final class HeaderUtil {

    private static final Logger log = LoggerFactory.getLogger(HeaderUtil.class);

    private HeaderUtil() {
    }

    public static HttpHeaders createAlert(String message, String param) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-tccmanagerApp-alert", message);
        headers.add("X-tccmanagerApp-params", param);
        return headers;
    }

    public static HttpHeaders createEntityCreationAlert(String entityName, String param) {
        String message = getMessage(entityName, param, "created");
        return createAlert(message, param);
    }

    public static HttpHeaders createEntityUpdateAlert(String entityName, String param) {
        String message = "";
        getMessage(entityName, param, "updated");
        return createAlert(message, param);
    }

    public static HttpHeaders createEntityDeletionAlert(String entityName, String param) {
        String message = getMessage(entityName, param, "deleted");
        return createAlert(message, param);
    }

    private static String getMessage(String entityName, String param, String action) {
        return "A " + entityName + " is "+ action +" with identifier " + param;
    }

    public static HttpHeaders createFailureAlert(String entityName, String errorKey, String defaultMessage) {
        log.error("Entity processing failed, {}", defaultMessage);
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-tccmanagerApp-error", defaultMessage);
        headers.add("X-tccmanagerApp-params", entityName);
        return headers;
    }
}
