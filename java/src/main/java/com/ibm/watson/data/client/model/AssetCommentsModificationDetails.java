/*
 * Copyright 2020 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.watson.data.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * AssetCommentsModificationDetails
 */
public class AssetCommentsModificationDetails {

    private CommentMetadata metadata;
    private AssetCommentModificationEntity entity;

    public AssetCommentsModificationDetails metadata(CommentMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     **/
    @javax.annotation.Nullable
    @JsonProperty("metadata")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public CommentMetadata getMetadata() { return metadata; }
    public void setMetadata(CommentMetadata metadata) { this.metadata = metadata; }

    public AssetCommentsModificationDetails entity(AssetCommentModificationEntity entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Get entity
     * @return entity
     **/
    @javax.annotation.Nullable
    @JsonProperty("entity")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public AssetCommentModificationEntity getEntity() { return entity; }
    public void setEntity(AssetCommentModificationEntity entity) { this.entity = entity; }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        AssetCommentsModificationDetails assetCommentsModificationDetails = (AssetCommentsModificationDetails)o;
        return Objects.equals(this.metadata, assetCommentsModificationDetails.metadata) &&
                Objects.equals(this.entity, assetCommentsModificationDetails.entity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, entity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetCommentsModificationDetails {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) { return "null"; }
        return o.toString().replace("\n", "\n    ");
    }

}
