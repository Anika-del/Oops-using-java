public class InvoicePersistance {
      Invoice invoice;

    public InvoicePersistance(Invoice invoice){
        this.invoice = invoice;
    }
     public void saveToFile(String filename){
//create to file with give name and writes the invoice
    }
    public void saveToDatabase(){
        //save invoice to dtabase;
    }    
}

interface InvoicePersistance{

    public void save(Invoice invoice);
}

public class DatabsePersistence implementation InvoicePersistance{

    @Override
    public void save(Invoice invoice){
        //save to DB
    }
}