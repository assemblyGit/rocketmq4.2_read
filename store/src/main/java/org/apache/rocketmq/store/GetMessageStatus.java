/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.store;

public enum GetMessageStatus {

    FOUND,

    NO_MATCHED_MESSAGE,

    MESSAGE_WAS_REMOVING,

    OFFSET_FOUND_NULL,

    OFFSET_OVERFLOW_BADLY,//溢出很多

    OFFSET_OVERFLOW_ONE,//offset  == ConsumeQueue中的maxoff溢出一个

    OFFSET_TOO_SMALL,//小于ConsumeQueue中的最小逻辑偏移

    NO_MATCHED_LOGIC_QUEUE,

    NO_MESSAGE_IN_QUEUE,//ConsumeQueue的maxoff = 0
}
