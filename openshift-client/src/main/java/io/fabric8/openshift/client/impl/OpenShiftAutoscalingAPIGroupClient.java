/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.openshift.client.impl;

import io.fabric8.kubernetes.client.extension.ClientAdapter;
import io.fabric8.openshift.client.dsl.OpenShiftAutoscalingAPIGroupDSL;
import io.fabric8.openshift.client.dsl.V1AutoscalingAPIGroupDSL;
import io.fabric8.openshift.client.dsl.V1beta1AutoscalingAPIGroupDSL;

public class OpenShiftAutoscalingAPIGroupClient extends ClientAdapter<OpenShiftAutoscalingAPIGroupClient>
    implements OpenShiftAutoscalingAPIGroupDSL {

  @Override
  public V1AutoscalingAPIGroupDSL v1() {
    return adapt(V1OpenShiftAutoscalingAPIGroupClient.class);
  }

  @Override
  public V1beta1AutoscalingAPIGroupDSL v1beta1() {
    return adapt(V1beta1OpenShiftAutoscalingAPIGroupClient.class);
  }

  @Override
  public OpenShiftAutoscalingAPIGroupClient newInstance() {
    return new OpenShiftAutoscalingAPIGroupClient();
  }
}
