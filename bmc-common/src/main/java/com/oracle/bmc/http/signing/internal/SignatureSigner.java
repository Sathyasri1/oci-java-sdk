/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.google.common.base.Preconditions;

import com.oracle.bmc.util.internal.Validate;
import lombok.extern.slf4j.Slf4j;

/**
 * The SignatureSigner is used to actually sign a message with a private key. This version is specific to RSA.
 */
@Immutable
@Slf4j
public class SignatureSigner {

    /**
     * Sign the given message using the given private key
     *
     * @param privateKey
     *            the private key to use to sign the message
     * @param message
     *            the message to sign, must not be null or empty
     * @param algorithm
     *            the algorithm to sign
     * @return an RSA signature of the message made using given private key and algorithm
     * @throws SignedRequestException
     *             if algorithm is invalid, key is invalid or signing fails
     */
    @Nonnull
    public byte[] sign(
            @Nonnull final RSAPrivateKey privateKey,
            @Nonnull final byte[] message,
            @Nonnull final String algorithm) {

        Preconditions.checkArgument(null != privateKey, "privateKey must not be null");
        Preconditions.checkArgument(
                (null != message) && (0 < message.length), "message must not be null or empty");
        Validate.notBlank(algorithm, "algorithm must be set to non-blank string");

        try {
            final Signature signature = Signature.getInstance(algorithm);
            signature.initSign(privateKey);
            signature.update(message);
            return signature.sign();
        } catch (final NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
            LOG.debug("Error signing message", e);
            throw new SignedRequestException(e);
        }
    }
}
