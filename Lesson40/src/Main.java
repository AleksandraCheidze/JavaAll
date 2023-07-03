public class Main {

  public static void main(String[] args) {

    DocumentsRegistry<License> licenseDocumentsRegistry = new DocumentsRegistry<License>();
    // Ctrl + D, Strg + D
    License license1 = new License();
    License license2 = new License();
    License license3 = new License();

    Certificate certificate = new Certificate();

    licenseDocumentsRegistry.add(license1);
    licenseDocumentsRegistry.add(license2);
    licenseDocumentsRegistry.add(license3);


  }
}
