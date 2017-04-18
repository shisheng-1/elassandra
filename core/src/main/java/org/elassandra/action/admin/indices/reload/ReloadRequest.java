/*
 * Copyright (c) 2017 Strapdata (http://www.strapdata.com)
 * Contains some code from Elasticsearch (http://www.elastic.co)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elassandra.action.admin.indices.reload;

import org.elasticsearch.action.ActionRequest;
import org.elasticsearch.action.support.broadcast.BroadcastRequest;

/**
 * Reload SSTables on all nodes = nodetool refresh <keyspace> <tables>.
 *
 * @see org.elasticsearch.client.Requests#reloadRequest(String...)
 * @see org.elasticsearch.client.IndicesAdminClient#reload(ReloadRequest)
 * @see ReloadResponse
 */
public class ReloadRequest extends BroadcastRequest<ReloadRequest> {

    public ReloadRequest() {
    }

    /**
     * Copy constructor that creates a new refresh request that is a copy of the one provided as an argument.
     * The new request will inherit though headers and context from the original request that caused it.
     */
    public ReloadRequest(ActionRequest originalRequest) {
        super(originalRequest);
    }

    public ReloadRequest(String... indices) {
        super(indices);
    }

}
