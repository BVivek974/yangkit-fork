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


public class SchemaComparisonNBCTest {

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
    public void tc_nbc_01() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/1_enumeration/enumeration@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/1_enumeration/enumeration@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/1_enumeration/enumeration_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_02() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/2_bits/bits@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/2_bits/bits@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/2_bits/bits_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_03_length() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_length/length@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_length/length@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_length/length_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_03_pattern() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_pattern/pattern@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_pattern/pattern@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_pattern/pattern_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_03_range() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_range/range@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_range/range@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/3_range/range_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_04() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/4_dflt/dflt@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/4_dflt/dflt@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/4_dflt/dflt_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_05() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/5_units/units@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/5_units/units@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/5_units/units_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_06() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/6_reference/reference@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/6_reference/reference@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/6_reference/reference_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_07() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/7_must/must@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/7_must/must@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/7_must/must_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_08() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/8_when/when@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/8_when/when@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/8_when/when_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_09() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/9_mandatory/mandatory@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/9_mandatory/mandatory@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/9_mandatory/mandatory_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_10() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/10_min-elements/min-elements@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/10_min-elements/min-elements@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/10_min-elements/min-elements_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_11() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/11_max-elements/max-elements@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/11_max-elements/max-elements@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/11_max-elements/max-elements_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_12() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/12_description/description@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/12_description/description@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/12_description/description_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_13() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/13_base-ident/base-ident@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/13_base-ident/base-ident@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/13_base-ident/base-ident_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_14() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/14_base/base@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/14_base/base@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/14_base/base_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_15() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/15_new-stmt/new-stmt@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/15_new-stmt/new-stmt@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/15_new-stmt/new-stmt_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_16() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/16_new-data-def/new-data-def@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/16_new-data-def/new-data-def@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/16_new-data-def/new-data-def_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_18() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/18_config/config@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/18_config/config@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/18_config/config_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_19() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/19_if-feature/if-feature@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/19_if-feature/if-feature@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/19_if-feature/if-feature_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_20() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/20_status/status@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/20_status/status@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/20_status/status_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_23() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/23_submod/old").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/23_submod/new").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/23_submod/submod1_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_26() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/26_data-def-order/data-def-order@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/26_data-def-order/data-def-order@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/26_data-def-order/data-def-order_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_X_ext_inst() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_ext-inst/ext-inst@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_ext-inst/ext-inst@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_ext-inst/ext-inst_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_X_presence() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_presence/presence@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_presence/presence@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_presence/presence_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_X_union() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_union/union@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_union/union@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_union/union_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

    @Test
    public void tc_nbc_X_yang_version() throws DocumentException, IOException, YangParserException {
        String oldYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_yang-version/yang-version@2000-01-01.yang").getFile();
        String newYang = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_yang-version/yang-version@2000-01-02.yang").getFile();
        String jsonResult = this.getClass().getClassLoader().getResource("schema_comparison/nbc/x_yang-version/yang-version_cmp.json").getFile();
        YangSchemaContext oldContext = YangYinParser.parse(oldYang);
        YangSchemaContext newContext = YangYinParser.parse(newYang);
        JsonNode result = loadJsonResult(jsonResult);
        compareSchema(oldContext, newContext, result);
    }

}
