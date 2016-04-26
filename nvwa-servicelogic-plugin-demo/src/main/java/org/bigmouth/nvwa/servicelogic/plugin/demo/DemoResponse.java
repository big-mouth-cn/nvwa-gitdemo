/*
 * Copyright 2016 mopote.com
 *
 * The Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.bigmouth.nvwa.servicelogic.plugin.demo;

import org.bigmouth.nvwa.sap.ContentType;
import org.bigmouth.nvwa.servicelogic.codec.annotation.CodecType;
import org.bigmouth.nvwa.servicelogic.handler.BaseResponse;

@CodecType(ContentType.JSON)
public class DemoResponse extends BaseResponse {

    private String echo;

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }
}
