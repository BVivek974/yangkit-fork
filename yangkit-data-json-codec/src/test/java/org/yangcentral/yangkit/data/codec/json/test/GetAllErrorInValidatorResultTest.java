package org.yangcentral.yangkit.data.codec.json.test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dom4j.DocumentException;
import org.junit.jupiter.api.Test;
import org.yangcentral.yangkit.common.api.validate.ValidatorRecord;
import org.yangcentral.yangkit.common.api.validate.ValidatorResultBuilder;
import org.yangcentral.yangkit.data.api.model.YangDataDocument;
import org.yangcentral.yangkit.data.codec.json.YangDataDocumentJsonParser;
import org.yangcentral.yangkit.model.api.schema.YangSchemaContext;
import org.yangcentral.yangkit.parser.YangParserException;
import org.yangcentral.yangkit.parser.YangYinParser;

import java.io.File;
import java.io.IOException;

public class GetAllErrorInValidatorResultTest {

    @Test
    public void test() throws DocumentException, IOException, YangParserException {
        String jsonFile = this.getClass().getClassLoader().getResource("errors/data.json").getFile();
        String yangFile = this.getClass().getClassLoader().getResource("errors/schema.yang").getFile();
        YangSchemaContext context = YangYinParser.parse(yangFile);
        context.validate();
        JsonNode data = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            data = objectMapper.readTree(new File(jsonFile));
        } catch (IOException ignored) {}

        ValidatorResultBuilder parseError = new ValidatorResultBuilder();
        YangDataDocument doc = new YangDataDocumentJsonParser(context).parse(data,parseError);
        for(ValidatorRecord r : parseError.build().getRecords()){
            System.out.println(r);
        }
    }
}