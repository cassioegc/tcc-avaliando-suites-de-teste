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

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to data with an optional data schema. 
 */
public class DataConnectionReference extends ObjectLocation {

    private DataSchema schema;

    public DataConnectionReference schema(DataSchema schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get schema
     * @return schema
     **/
    @javax.annotation.Nullable
    @JsonProperty("schema")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public DataSchema getSchema() { return schema; }
    public void setSchema(DataSchema schema) { this.schema = schema; }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        DataConnectionReference dataConnectionReference = (DataConnectionReference) o;
        return super.equals(o) &&
                Objects.equals(this.schema, dataConnectionReference.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataConnectionReference {\n");
        super.toString(sb);
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
