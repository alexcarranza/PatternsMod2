package interfaceSegregation.interfac;

public interface CloudStorageProvider {
	void storeFile(String name);
	String getFile(String name);
}
