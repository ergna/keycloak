/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.keycloak.operator;

import java.util.Map;

public final class Constants {
    public static final String CRDS_GROUP = "keycloak.org";
    public static final String CRDS_VERSION = "v2alpha1";
    public static final String SHORT_NAME = "kc";
    public static final String NAME = "keycloak";
    public static final String PLURAL_NAME = "keycloaks";
    public static final String MANAGED_BY_LABEL = "app.kubernetes.io/managed-by";
    public static final String MANAGED_BY_VALUE = "keycloak-operator";

    public static final Map<String, String> DEFAULT_LABELS = Map.of(
            "app", NAME,
            MANAGED_BY_LABEL, MANAGED_BY_VALUE
    );

    public static final Map<String, String> DEFAULT_DIST_CONFIG = Map.of(
        "KC_HEALTH_ENABLED","true",
        "KC_CACHE", "ispn",
        "KC_CACHE_STACK", "kubernetes"
    );

    // Init container
    public static final String EXTENSIONS_VOLUME_NAME = "extensions";
    public static final String KEYCLOAK_PROVIDERS_FOLDER = "/opt/keycloak/providers";
    public static final String INIT_CONTAINER_NAME = "keycloak-extensions";
    public static final String INIT_CONTAINER_EXTENSIONS_FOLDER = "/opt/extensions";
    public static final String INIT_CONTAINER_EXTENSIONS_ENV_VAR = "KEYCLOAK_EXTENSIONS";

    public static final Integer KEYCLOAK_HTTP_PORT = 8080;
    public static final Integer KEYCLOAK_HTTPS_PORT = 8443;
    public static final String KEYCLOAK_SERVICE_PROTOCOL = "TCP";
    public static final String KEYCLOAK_SERVICE_SUFFIX = "-service";
    public static final Integer KEYCLOAK_DISCOVERY_SERVICE_PORT = 7800;
    public static final String KEYCLOAK_DISCOVERY_SERVICE_SUFFIX = "-discovery";

    public static final String KEYCLOAK_INGRESS_SUFFIX = "-ingress";

    public static final String INSECURE_DISABLE = "INSECURE-DISABLE";
    public static final String CERTIFICATES_FOLDER = "/mnt/certificates";
}
