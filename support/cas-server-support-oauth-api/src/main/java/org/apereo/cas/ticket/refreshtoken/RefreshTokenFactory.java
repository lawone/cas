package org.apereo.cas.ticket.refreshtoken;

import org.apereo.cas.authentication.Authentication;
import org.apereo.cas.authentication.principal.Service;
import org.apereo.cas.ticket.TicketFactory;
import org.apereo.cas.ticket.TicketGrantingTicket;

import java.util.Collection;
import java.util.Map;

/**
 * Factory to create OAuth refresh tokens.
 *
 * @author Jerome Leleu
 * @since 5.0.0
 */
public interface RefreshTokenFactory extends TicketFactory {

    /**
     * Create a refresh token.
     *
     * @param service              the service
     * @param authentication       the authentication
     * @param ticketGrantingTicket the ticket granting ticket
     * @param scopes               the scopes
     * @param clientId             the client id
     * @param requestClaims        the request claims
     * @return the refresh token
     */
    RefreshToken create(Service service, Authentication authentication,
                        TicketGrantingTicket ticketGrantingTicket,
                        Collection<String> scopes,
                        String clientId,
                        Map<String, Map<String, Object>> requestClaims);
}
