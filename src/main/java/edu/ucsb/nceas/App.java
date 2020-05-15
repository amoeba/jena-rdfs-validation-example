package edu.ucsb.nceas;

import java.util.Iterator;

import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.reasoner.ValidityReport;
import org.apache.jena.util.FileManager;

public class App
{
    public static void main( String[] args )
    {
        String onturi = "https://raw.githubusercontent.com/apache/jena/master/jena-core/testing/reasoners/rdfs/dttest2.nt";
        Model data = FileManager.get().loadModel(onturi);

        InfModel infmodel = ModelFactory.createRDFSModel(data);
        ValidityReport validity = infmodel.validate();

        if (validity.isValid()) {
            System.out.println("OK");
        } else {
            System.out.println("Conflicts");
            for (Iterator i = validity.getReports(); i.hasNext(); ) {
                System.out.println(" - " + i.next());
            }
        }
    }
}
