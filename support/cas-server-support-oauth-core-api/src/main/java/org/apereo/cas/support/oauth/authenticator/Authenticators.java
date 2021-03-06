package org.apereo.cas.support.oauth.authenticator;

/**
 * This is {@link Authenticators}.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
public interface Authenticators {
    /**
     * Generic oauth clients.
     */
    String CAS_OAUTH_CLIENT = "CasOAuthClient";
    /**
     * OAuth authn for basic authn.
     */
    String CAS_OAUTH_CLIENT_BASIC_AUTHN = "clientBasicAuth";
    /**
     * OAuth authn for access token authn.
     */
    String CAS_OAUTH_CLIENT_ACCESS_TOKEN_AUTHN = "clientAccessTokenAuth";
    /**
     * OAuth authn for client id and secret.
     */
    String CAS_OAUTH_CLIENT_DIRECT_FORM = "clientForm";
    /**
     * OAuth authn for username/password.
     */
    String CAS_OAUTH_CLIENT_USER_FORM = "userForm";
    /**
     * OAuth authn for PKCE.
     */
    String CAS_OAUTH_CLIENT_PROOF_KEY_CODE_EXCHANGE_AUTHN = "pkceAuthn";
}
