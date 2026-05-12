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


public class SchemaComparisonBCTest {

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
    public void tc_bc_01() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/1_enumeration/enumeration@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/1_enumeration/enumeration@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/1_enumeration/enumeration_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_02() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/2_bits/bits@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/2_bits/bits@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/2_bits/bits_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_03_length() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_length/length@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_length/length@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_length/length_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_03_pattern() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_pattern/pattern@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_pattern/pattern@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_pattern/pattern_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_03_range() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_range/range@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_range/range@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/3_range/range_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_04() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/4_dflt/dflt@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/4_dflt/dflt@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/4_dflt/dflt_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_05() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/5_units/units@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/5_units/units@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/5_units/units_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_06() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/6_reference/reference@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/6_reference/reference@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/6_reference/reference_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_07() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/7_must/must@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/7_must/must@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/7_must/must_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_08() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/8_when/when@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/8_when/when@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/8_when/when_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_09() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/9_mandatory/mandatory@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/9_mandatory/mandatory@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/9_mandatory/mandatory_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_10() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/10_min-elements/min-elements@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/10_min-elements/min-elements@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/10_min-elements/min-elements_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_11() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/11_max-elements/max-elements@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/11_max-elements/max-elements@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/11_max-elements/max-elements_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_12() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/12_description/description@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/12_description/description@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/12_description/description_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_13() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/13_base-ident/base-ident@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/13_base-ident/base-ident@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/13_base-ident/base-ident_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_14() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/14_base/base@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/14_base/base@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/14_base/base_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_15() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/15_new-stmt/new-stmt@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/15_new-stmt/new-stmt@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/15_new-stmt/new-stmt_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_16() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/16_new-data-def/new-data-def@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/16_new-data-def/new-data-def@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/16_new-data-def/new-data-def_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_17() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/17_case/case@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/17_case/case@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/17_case/case_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_18() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/18_config/config@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/18_config/config@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/18_config/config_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_19() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/19_if-feature/if-feature@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/19_if-feature/if-feature@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/19_if-feature/if-feature_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_20() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/20_status/status@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/20_status/status@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/20_status/status_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_21() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/21_type/type@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/21_type/type@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/21_type/type_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_bc_22() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/22_uses/uses@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/bc/22_uses/uses@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/bc/22_uses/uses_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

}
