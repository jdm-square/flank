/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.testing.model;

/**
 * Network emulation parameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrafficRule extends com.google.api.client.json.GenericJson {

  /**
   * Bandwidth in kbits/second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float bandwidth;

  /**
   * Burst size in kbits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float burst;

  /**
   * Packet delay, must be >= 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String delay;

  /**
   * Packet duplication ratio (0.0 - 1.0).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float packetDuplicationRatio;

  /**
   * Packet loss ratio (0.0 - 1.0).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float packetLossRatio;

  /**
   * Bandwidth in kbits/second.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBandwidth() {
    return bandwidth;
  }

  /**
   * Bandwidth in kbits/second.
   * @param bandwidth bandwidth or {@code null} for none
   */
  public TrafficRule setBandwidth(java.lang.Float bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

  /**
   * Burst size in kbits.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBurst() {
    return burst;
  }

  /**
   * Burst size in kbits.
   * @param burst burst or {@code null} for none
   */
  public TrafficRule setBurst(java.lang.Float burst) {
    this.burst = burst;
    return this;
  }

  /**
   * Packet delay, must be >= 0.
   * @return value or {@code null} for none
   */
  public String getDelay() {
    return delay;
  }

  /**
   * Packet delay, must be >= 0.
   * @param delay delay or {@code null} for none
   */
  public TrafficRule setDelay(String delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Packet duplication ratio (0.0 - 1.0).
   * @return value or {@code null} for none
   */
  public java.lang.Float getPacketDuplicationRatio() {
    return packetDuplicationRatio;
  }

  /**
   * Packet duplication ratio (0.0 - 1.0).
   * @param packetDuplicationRatio packetDuplicationRatio or {@code null} for none
   */
  public TrafficRule setPacketDuplicationRatio(java.lang.Float packetDuplicationRatio) {
    this.packetDuplicationRatio = packetDuplicationRatio;
    return this;
  }

  /**
   * Packet loss ratio (0.0 - 1.0).
   * @return value or {@code null} for none
   */
  public java.lang.Float getPacketLossRatio() {
    return packetLossRatio;
  }

  /**
   * Packet loss ratio (0.0 - 1.0).
   * @param packetLossRatio packetLossRatio or {@code null} for none
   */
  public TrafficRule setPacketLossRatio(java.lang.Float packetLossRatio) {
    this.packetLossRatio = packetLossRatio;
    return this;
  }

  @Override
  public TrafficRule set(String fieldName, Object value) {
    return (TrafficRule) super.set(fieldName, value);
  }

  @Override
  public TrafficRule clone() {
    return (TrafficRule) super.clone();
  }

}
