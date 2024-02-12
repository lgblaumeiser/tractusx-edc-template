/********************************************************************************
 * Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ********************************************************************************/

package org.eclipse.tractusx.edc.iam.ssi.spi.jsonld;

/**
 * Local copy of the W3C VC data model context for testing, obtained from {@code https://www.w3.org/ns/credentials/v2}.
 */
public interface W3cVcContext {

    String W3C_VC_CONTEXT = """
            {
              "@context": {
                "@version": 1.1,
                "@protected": true,

                "id": "@id",
                "type": "@type",

                "VerifiableCredential": {
                  "@id": "https://www.w3.org/2018/credentials#VerifiableCredential",
                  "@context": {
                    "@version": 1.1,
                    "@protected": true,

                    "id": "@id",
                    "type": "@type",

                    "cred": "https://www.w3.org/2018/credentials#",
                    "sec": "https://w3id.org/security#",
                    "xsd": "http://www.w3.org/2001/XMLSchema#",

                    "credentialSchema": {
                      "@id": "cred:credentialSchema",
                      "@type": "@id",
                      "@context": {
                        "@version": 1.1,
                        "@protected": true,

                        "id": "@id",
                        "type": "@type",

                        "cred": "https://www.w3.org/2018/credentials#",

                        "JsonSchemaValidator2018": "cred:JsonSchemaValidator2018"
                      }
                    },
                    "credentialStatus": {"@id": "cred:credentialStatus", "@type": "@id"},
                    "credentialSubject": {"@id": "cred:credentialSubject", "@type": "@id"},
                    "evidence": {"@id": "cred:evidence", "@type": "@id"},
                    "expirationDate": {"@id": "cred:expirationDate", "@type": "xsd:dateTime"},
                    "holder": {"@id": "cred:holder", "@type": "@id"},
                    "issued": {"@id": "cred:issued", "@type": "xsd:dateTime"},
                    "issuer": {"@id": "cred:issuer", "@type": "@id"},
                    "issuanceDate": {"@id": "cred:issuanceDate", "@type": "xsd:dateTime"},
                    "proof": {"@id": "sec:proof", "@type": "@id", "@container": "@graph"},
                    "refreshService": {
                      "@id": "cred:refreshService",
                      "@type": "@id",
                      "@context": {
                        "@version": 1.1,
                        "@protected": true,

                        "id": "@id",
                        "type": "@type",

                        "cred": "https://www.w3.org/2018/credentials#",

                        "ManualRefreshService2018": "cred:ManualRefreshService2018"
                      }
                    },
                    "termsOfUse": {"@id": "cred:termsOfUse", "@type": "@id"},
                    "validFrom": {"@id": "cred:validFrom", "@type": "xsd:dateTime"},
                    "validUntil": {"@id": "cred:validUntil", "@type": "xsd:dateTime"}
                  }
                },

                "VerifiablePresentation": {
                  "@id": "https://www.w3.org/2018/credentials#VerifiablePresentation",
                  "@context": {
                    "@version": 1.1,
                    "@protected": true,

                    "id": "@id",
                    "type": "@type",

                    "cred": "https://www.w3.org/2018/credentials#",
                    "sec": "https://w3id.org/security#",

                    "holder": {"@id": "cred:holder", "@type": "@id"},
                    "proof": {"@id": "sec:proof", "@type": "@id", "@container": "@graph"},
                    "verifiableCredential": {"@id": "cred:verifiableCredential", "@type": "@id", "@container": "@graph"}
                  }
                },

                "EcdsaSecp256k1Signature2019": {
                  "@id": "https://w3id.org/security#EcdsaSecp256k1Signature2019",
                  "@context": {
                    "@version": 1.1,
                    "@protected": true,

                    "id": "@id",
                    "type": "@type",

                    "sec": "https://w3id.org/security#",
                    "xsd": "http://www.w3.org/2001/XMLSchema#",

                    "challenge": "sec:challenge",
                    "created": {"@id": "http://purl.org/dc/terms/created", "@type": "xsd:dateTime"},
                    "domain": "sec:domain",
                    "expires": {"@id": "sec:expiration", "@type": "xsd:dateTime"},
                    "jws": "sec:jws",
                    "nonce": "sec:nonce",
                    "proofPurpose": {
                      "@id": "sec:proofPurpose",
                      "@type": "@vocab",
                      "@context": {
                        "@version": 1.1,
                        "@protected": true,

                        "id": "@id",
                        "type": "@type",

                        "sec": "https://w3id.org/security#",

                        "assertionMethod": {"@id": "sec:assertionMethod", "@type": "@id", "@container": "@set"},
                        "authentication": {"@id": "sec:authenticationMethod", "@type": "@id", "@container": "@set"}
                      }
                    },
                    "proofValue": "sec:proofValue",
                    "verificationMethod": {"@id": "sec:verificationMethod", "@type": "@id"}
                  }
                },

                "EcdsaSecp256r1Signature2019": {
                  "@id": "https://w3id.org/security#EcdsaSecp256r1Signature2019",
                  "@context": {
                    "@version": 1.1,
                    "@protected": true,

                    "id": "@id",
                    "type": "@type",

                    "sec": "https://w3id.org/security#",
                    "xsd": "http://www.w3.org/2001/XMLSchema#",

                    "challenge": "sec:challenge",
                    "created": {"@id": "http://purl.org/dc/terms/created", "@type": "xsd:dateTime"},
                    "domain": "sec:domain",
                    "expires": {"@id": "sec:expiration", "@type": "xsd:dateTime"},
                    "jws": "sec:jws",
                    "nonce": "sec:nonce",
                    "proofPurpose": {
                      "@id": "sec:proofPurpose",
                      "@type": "@vocab",
                      "@context": {
                        "@version": 1.1,
                        "@protected": true,

                        "id": "@id",
                        "type": "@type",

                        "sec": "https://w3id.org/security#",

                        "assertionMethod": {"@id": "sec:assertionMethod", "@type": "@id", "@container": "@set"},
                        "authentication": {"@id": "sec:authenticationMethod", "@type": "@id", "@container": "@set"}
                      }
                    },
                    "proofValue": "sec:proofValue",
                    "verificationMethod": {"@id": "sec:verificationMethod", "@type": "@id"}
                  }
                },

                "Ed25519Signature2018": {
                  "@id": "https://w3id.org/security#Ed25519Signature2018",
                  "@context": {
                    "@version": 1.1,
                    "@protected": true,

                    "id": "@id",
                    "type": "@type",

                    "sec": "https://w3id.org/security#",
                    "xsd": "http://www.w3.org/2001/XMLSchema#",

                    "challenge": "sec:challenge",
                    "created": {"@id": "http://purl.org/dc/terms/created", "@type": "xsd:dateTime"},
                    "domain": "sec:domain",
                    "expires": {"@id": "sec:expiration", "@type": "xsd:dateTime"},
                    "jws": "sec:jws",
                    "nonce": "sec:nonce",
                    "proofPurpose": {
                      "@id": "sec:proofPurpose",
                      "@type": "@vocab",
                      "@context": {
                        "@version": 1.1,
                        "@protected": true,

                        "id": "@id",
                        "type": "@type",

                        "sec": "https://w3id.org/security#",

                        "assertionMethod": {"@id": "sec:assertionMethod", "@type": "@id", "@container": "@set"},
                        "authentication": {"@id": "sec:authenticationMethod", "@type": "@id", "@container": "@set"}
                      }
                    },
                    "proofValue": "sec:proofValue",
                    "verificationMethod": {"@id": "sec:verificationMethod", "@type": "@id"}
                  }
                },

                "RsaSignature2018": {
                  "@id": "https://w3id.org/security#RsaSignature2018",
                  "@context": {
                    "@version": 1.1,
                    "@protected": true,

                    "challenge": "sec:challenge",
                    "created": {"@id": "http://purl.org/dc/terms/created", "@type": "xsd:dateTime"},
                    "domain": "sec:domain",
                    "expires": {"@id": "sec:expiration", "@type": "xsd:dateTime"},
                    "jws": "sec:jws",
                    "nonce": "sec:nonce",
                    "proofPurpose": {
                      "@id": "sec:proofPurpose",
                      "@type": "@vocab",
                      "@context": {
                        "@version": 1.1,
                        "@protected": true,

                        "id": "@id",
                        "type": "@type",

                        "sec": "https://w3id.org/security#",

                        "assertionMethod": {"@id": "sec:assertionMethod", "@type": "@id", "@container": "@set"},
                        "authentication": {"@id": "sec:authenticationMethod", "@type": "@id", "@container": "@set"}
                      }
                    },
                    "proofValue": "sec:proofValue",
                    "verificationMethod": {"@id": "sec:verificationMethod", "@type": "@id"}
                  }
                },

                "proof": {"@id": "https://w3id.org/security#proof", "@type": "@id", "@container": "@graph"}
              }
            }
            """;


}
