package com.microservice.product_catalog;

import com.microservice.product_catalog.dto.ProductDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
public class ProductCatalogControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreate() throws Exception{

        String exampleProductDTO = createProduct().toString();
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/product")
                .accept(MediaType.APPLICATION_JSON).content(exampleProductDTO)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = result.getResponse();
        System.out.println(response.getStatus());
    }


    private ProductDTO createProduct(){
        return ProductDTO.builder().id("1").desc("desc").title("title").imagePath("img").unitPrice(0.0).build();
    }
}
