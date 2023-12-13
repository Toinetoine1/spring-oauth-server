/*
 * Copyright (C) 2017 Authlete, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package com.authlete.spring.server.api;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;
import com.authlete.common.api.AuthleteApiFactory;
import com.authlete.jakarta.BaseJwksEndpoint;


/**
 * JWK Set endpoint.
 *
 * <p>
 * An OpenID Provider (OP) is required to expose its JSON Web Key Set document
 * (JWK Set) so that client applications can (1) verify signatures by the OP
 * and (2) encrypt their requests to the OP. The URI of a JWK Set endpoint can
 * be found as the value of <b>{@code jwks_uri}</b> in <a href=
 * "http://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata"
 * >OpenID Provider Metadata</a> if the OP supports <a href=
 * "http://openid.net/specs/openid-connect-discovery-1_0.html">OpenID
 * Connect Discovery 1.0</a>.
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc7517"
 *      >RFC 7517, JSON Web Key (JWK)</a>
 *
 * @see <a href="http://openid.net/specs/openid-connect-core-1_0.htm"
 *      >OpenID Connect Core 1.0</a>
 *
 * @see <a href="http://openid.net/specs/openid-connect-discovery-1_0.html"
 *      >OpenID Connect Discovery 1.0</a>
 */
@Component
@Path("/jwks")
public class JwksEndpoint extends BaseJwksEndpoint
{
    /**
     * JWK Set endpoint.
     */
    @GET
    public Response get()
    {
        // Handle the JWK Set request.
        return handle(AuthleteApiFactory.getDefaultApi());
    }
}
