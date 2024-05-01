import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class methods {

	public static void main(String[] args) {
		methods object = new methods();
		object.getData();
		getDataWithoutObject();
		methods2 object2 = new methods2();
		object2.getDataFromAnotherClass();
	}
	public void getData() {
		System.out.println("Harish Yemireddy");
	}
	public static void getDataWithoutObject() {
		System.out.println("Data without Object");
	}
	
}