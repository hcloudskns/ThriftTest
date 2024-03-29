import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class ArithmeticClient {
	
  private void invoke() {
	        TTransport transport;
	        try {
	            transport = new TSocket("localhost", 7911);

	            TProtocol protocol = new TBinaryProtocol(transport);

	            ArithmeticService.Client client = new ArithmeticService.Client(protocol);
	            transport.open();

	            long addResult = client.add(100, 200);
	            //System.out.println("Add result: " + addResult 현조  승민;
	            long multiplyResult = client.multiply(20, 40);
	           // System.out.println("Multiply result: " + multiplyResult);

	            //transport
	            
	            transport.close();
	        } catch (TTransportException e) {
	            e.printStackTrace();
	        } catch (TException e) {
	            e.printStackTrace();
	        }
   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArithmeticClient c = new ArithmeticClient();
	     c.invoke();

	}

}
