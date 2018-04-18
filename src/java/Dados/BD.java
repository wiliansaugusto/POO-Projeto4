package Dados;
import java.util.ArrayList;

public class BD {
    private static ArrayList<Cliente> Clientes = new ArrayList<>();
    private static ArrayList<Fornecedor> Fornecedores = new ArrayList<>();

    public static ArrayList<Cliente> getClientes() { return Clientes; }
    public static ArrayList<Fornecedor> getFornecedores() { return Fornecedores; }
}
