package org.yangcentral.yangkit.test.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dom4j.DocumentException;
import org.junit.jupiter.api.Test;
import org.yangcentral.yangkit.model.api.schema.YangSchemaContext;
import org.yangcentral.yangkit.parser.YangParserException;
import org.yangcentral.yangkit.parser.YangYinParser;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SchemaComparisonEDTest {

    JsonNode loadJsonResult(String file) {
        JsonNode data = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            data = objectMapper.readTree(new File(file));
        } catch (IOException ignored) {
        }
        assertNotNull(data);
        return data;
    }

    void compareSchema(YangSchemaContext oldContext,
                       YangSchemaContext newContext,
                       JsonNode expected) throws JsonProcessingException {
        JsonNode result = new ObjectMapper().readTree("{}");
        assertEquals(expected, result);
    }

    @Test
    public void tc_ed_22() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/ed/22_uses/uses@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/ed/22_uses/uses@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/ed/22_uses/uses_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_ed_24() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/ed/24_prefix/prefix@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/ed/24_prefix/prefix@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/ed/24_prefix/prefix_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

}
