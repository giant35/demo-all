package demo;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.SolrClientBuilder;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.params.MapSolrParams;

import java.io.IOException;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, SolrServerException {
        HttpSolrClient client = new HttpSolrClient.Builder("http://localhost:8983/solr")
                .withConnectionTimeout(5000)
                .withSocketTimeout(5000)
                .build();
        Map<String, String> p = Map.of("q", "*:*", "sort", "id desc");
        QueryResponse resp = client.query("films", new MapSolrParams(p));
        var docs = resp.getResults();
        for (var doc : docs) {
            System.out.println("doc:" + doc.get("name"));
        }
    }
}
