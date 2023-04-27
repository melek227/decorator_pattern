
// UML diyagramındaki Component (IDataSource) arayüzünü uygular.

// Bu sınıftan türeyen sınıfların uygulamasını, değiştirilmesini istediğimiz metotları abstract anahtar kelimesi ile işaretledik.
// UML diyagramındaki BaseDecorator yapısına denk gelmektedir.
abstract class BaseDataSourceDecorator implements IDataSource {
    protected IDataSource dataSource;

    public BaseDataSourceDecorator(IDataSource dataSource) {
        // Constructor sayesinde özellikleri değiştirilmesi istenen nesnenin referansı tutulur.
        this.dataSource = dataSource;
    }

    public abstract String getFileName();

    public abstract void readData();

    public abstract void writeData(Object data);
}
