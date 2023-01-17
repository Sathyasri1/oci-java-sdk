/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.time.Duration;

/**
 * An interface that has the API to return
 * refresh security token after if the token expires within
 * a configurable time
 */
public interface ProvidesConfigurableRefresh {
    String refreshAndGetSecurityTokenIfExpiringWithin(Duration time);
}
