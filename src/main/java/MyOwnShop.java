import java.io.*;
import java.util.Scanner;
public class MyOwnShop {
    public static int i = 0;
    public static int e = 0;
    public static int[] cantidadventa = new int[100];
    public static int Log = 0;
    public static String[] producto = new String[100];
    public static String[] NomProd = new String[100];
    public static String[] arrventa = new String[100];
    public static double[] PrecProd = new double[100];
    public static double PrecProduc;
    public static String NomProduc;
    public static int[] ExistProd = new int[100];
    public static double[] PSug = new double[100];

    public static void main(String[] args) {
        // ------------------Menú------------------//
        cargararchivo();
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[34m _____ ______       ___    ___      ________  ___       __   ________           ________  ___  ___  ________  ________   \n" +
                "|\\   _ \\  _   \\    |\\  \\  /  /|    |\\   __  \\|\\  \\     |\\  \\|\\   ___  \\        |\\   ____\\|\\  \\|\\  \\|\\   __  \\|\\   __  \\  \n" +
                "\\ \\  \\\\\\__\\ \\  \\   \\ \\  \\/  / /    \\ \\  \\|\\  \\ \\  \\    \\ \\  \\ \\  \\\\ \\  \\       \\ \\  \\___|\\ \\  \\\\\\  \\ \\  \\|\\  \\ \\  \\|\\  \\ \n" +
                " \\ \\  \\\\|__| \\  \\   \\ \\    / /      \\ \\  \\\\\\  \\ \\  \\  __\\ \\  \\ \\  \\\\ \\  \\       \\ \\_____  \\ \\   __  \\ \\  \\\\\\  \\ \\   ____\\\n" +
                "  \\ \\  \\    \\ \\  \\   \\/  /  /        \\ \\  \\\\\\  \\ \\  \\|\\__\\_\\  \\ \\  \\\\ \\  \\       \\|____|\\  \\ \\  \\ \\  \\ \\  \\\\\\  \\ \\  \\___|\n" +
                "   \\ \\__\\    \\ \\__\\__/  / /           \\ \\_______\\ \\____________\\ \\__\\\\ \\__\\        ____\\_\\  \\ \\__\\ \\__\\ \\_______\\ \\__\\   \n" +
                "    \\|__|     \\|__|\\___/ /             \\|_______|\\|____________|\\|__| \\|__|       |\\_________\\|__|\\|__|\\|_______|\\|__|   \n" +
                "                  \\|___|/                                                         \\|_________|                           \n" +
                "                                                                                                           \u001B[0m");
        System.out.println("\u001B[33m----------------------------------------------------------------------------------------------------------------------------\u001B[0m");

        String opcMenu = "";
        while (!opcMenu.equals("4")) {
            System.out.println("¿A qué módulo deseas ingresar?\n  1. Inventario\n  2. Ventas\n  3. Estadisticas\n  4. Salir");
            opcMenu = sc.nextLine();
            switch (opcMenu) {
<<<<<<< HEAD
                case "1":
                    Inventario();
                    break;
                case "2":
                    Ventas();
                    break;
                case "3":
=======
                case 1:
                    Limpiar();
                    Inventario();
                    break;
                case 2:
                    Limpiar();
                    Ventas();
                    break;
                case 3:
                    Limpiar();
>>>>>>> 475ff54a785635fceb1ac4ad33d233c6f997087f
                    Estadisticas();
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }
    }

    private static void Estadisticas() {
        //--------Ingreso al módulo de estadisticas----------------//
        //---Login básico para que solo el administrador pueda entrar---//
        Log = 0;
        while (Log == 0) {
            LoginBasico();
        }
        Scanner sc = new Scanner(System.in);
        String seleccion = "";
        while (!seleccion.equals("4")) {
            System.out.println( "\u001B[32m __  __  ____  ____  __ __  _     ____     ____  ____     ____   ____  _____  ____   ____  _   ____  _____  _  ____   ____    ____ \n" +
                    "|  \\/  |/ () \\| _) \\|  |  || |__ / () \\   | _) \\| ===|   | ===| (_ (_`|_   _|/ () \\ | _) \\| | (_ (_`|_   _|| |/ (__` / () \\  (_ (_`\n" +
                    "|_|\\/|_|\\____/|____/ \\___/ |____|\\____/   |____/|____|   |____|.__)__)  |_| /__/\\__\\|____/|_|.__)__)  |_|  |_|\\____)/__/\\__\\.__)__)" );
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\u001B[0m");
            System.out.println("¿A dónde quieres ir?");
            System.out.println("  [1] Reporte de ventas.");
            System.out.println("  [2] Productos destacados. ");
            System.out.println("  [3] Competidores.");
            System.out.println("  [4] Salir.");
            seleccion = sc.nextLine();
            switch (seleccion) {
                case "1":
                    ReportaVentas();
                    break;
                case "2":
                    DatosDelProducto();
                    break;
                case "3":
                    Competidores();
                    break;
                case "4":
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("Elige una opción correcta.");
                    break;
            }
        }
    }

    private static void Competidores() {
        //---Ingreso al submódulo de competidores---//
        Scanner sc = new Scanner(System.in);
        String seleccionado;
        System.out.println("¿Deseas comparar los precios de los competidores con los tuyos?");
        System.out.println("  1. Sí\n  2. No");
        seleccionado = sc.nextLine();
        if (seleccionado .equals("1")) {
            precioCOMP();
        }
    }

    private static void precioCOMP() {
        {
            //---Método para comparar los precios con los de los competidores---//
            Scanner sc = new Scanner(System.in);
            double ComPre;
            double MyPre;
            double[] PrecCom = new double[100];
            double[] PrecMY = new double[100];
            int CONT = 0;
            String otroprec;
            do {
                System.out.println("ingresa el precio del producto de tu competidor");
<<<<<<< HEAD
                ComPre = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el precio de tu producto ");
                MyPre = sc.nextInt();
                sc.nextLine();
                PrecCom[CONT] = ComPre - MyPre;
                CONT++;
                System.out.println("¿Deseas ingresar otro precio?\n  1. Sí\n  2.No");
                otroprec = sc.nextLine();
            } while (otroprec.equals("1"));
=======
                ComPre = sc.nextDouble();
                System.out.println("Ingresa el precio de tu producto ");
                MyPre = sc.nextDouble();
                PrecCom[CONT] = ComPre - MyPre;
                CONT++;
                System.out.println("¿Deseas ingresar otro precio?\n1.Sí\n2.No");
                otroprec = sc.nextInt();
            } while (otroprec == 1);
>>>>>>> 475ff54a785635fceb1ac4ad33d233c6f997087f
            for (int h = 0; h < CONT; h++) {
                System.out.println("La diferencia que hay entre tu precio y el de tu competidor es de $" + PrecCom[h] + " pesos");
            }

        }
    }

    private static void DatosDelProducto() {
        String elegProd = "";
        while (!elegProd.equals("3")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Elige qué productos quieres visualizar");
            System.out.println("  [1] Más vendidos");
            System.out.println("  [2] Menos vendidos");
            System.out.println("  [3] Regresar");
            elegProd = sc.nextLine();
            switch (elegProd) {
                case "1":
                    MasVendidos();
                    break;
                case "2":
                    MenosVendidos();
                    break;
                case "3":
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Ingresa opciones válidas");
                    break;
            }
        }
    }

    private static void MasVendidos()
    {
        System.out.println("Mostrando productos más vendidos");
        //Validacion xdxdxd//
        if (i == 0)
        {
            System.out.println("No hay productos registrados.");
            return;
        }


        int[] codigosCopia = new int[i];
        String[] nombresCopia = new String[i];
        int[] ventasCopia = new int[i];

        for (int j = 0; j < i; j++) {
            codigosCopia[j] = j;
            nombresCopia[j] = NomProd[j];
            ventasCopia[j] = cantidadventa[j];
        }
                //ordena ascendentemente
        for (int j = 0; j < i - 1; j++)
        {
            for (int k = 0; k < i - 1 - j; k++)
            {
                if (ventasCopia[k] < ventasCopia[k + 1])
                {
                    int tempVentas = ventasCopia[k];
                    ventasCopia[k] = ventasCopia[k + 1];
                    ventasCopia[k + 1] = tempVentas;

                    String tempNombre = nombresCopia[k];
                    nombresCopia[k] = nombresCopia[k + 1];
                    nombresCopia[k + 1] = tempNombre;

                    int tempCodigo = codigosCopia[k];
                    codigosCopia[k] = codigosCopia[k + 1];
                    codigosCopia[k + 1] = tempCodigo;
                }
            }
        }

        //muestra la lista, no es parte del codigo que los determina
        System.out.println("--- Productos Más Vendidos ---");
        System.out.println("Ranking | Código | Producto | Ventas Totales");
        System.out.println("---------------------------------------------");
        for (int j = 0; j < i; j++)
        //esto es para los productos que solo tienen 1
        {
            if (ventasCopia[j] > 0)
            {
                System.out.println((j + 1) + " |" + codigosCopia[j] + " | " + nombresCopia[j] + " | " + ventasCopia[j]);
            }
        }
        System.out.println("---------------------------------------------");
    }



    private static void MenosVendidos()
    {
        System.out.println("Mostrando productos menos vendidos");
        //tiene validacion igual
        if (i == 0)
        {
            System.out.println("No hay productos registrados.");
            return;
        }

        // Copias de los arreglos que si podemos modificar
        int[] codigosCopia = new int[i];
        String[] nombresCopia = new String[i];
        int[] ventasCopia = new int[i];

        for (int j = 0; j < i; j++)
        {
            codigosCopia[j] = j;
            nombresCopia[j] = NomProd[j];
            ventasCopia[j] = cantidadventa[j];
        }

        // Ordena descendentemente
        for (int j = 0; j < i - 1; j++)
        {
            for (int k = 0; k < i - 1 - j; k++)
            {
                if (ventasCopia[k] > ventasCopia[k + 1])
                {
                    int tempVentas = ventasCopia[k];
                    ventasCopia[k] = ventasCopia[k + 1];
                    ventasCopia[k + 1] = tempVentas;

                    String tempNombre = nombresCopia[k];
                    nombresCopia[k] = nombresCopia[k + 1];
                    nombresCopia[k + 1] = tempNombre;

                    int tempCodigo = codigosCopia[k];
                    codigosCopia[k] = codigosCopia[k + 1];
                    codigosCopia[k + 1] = tempCodigo;
                }
            }
        }
        System.out.println("--- Ranking de Productos Menos Vendidos ---");
        System.out.println("Ranking | Código | Producto | Ventas Totales");
        System.out.println("---------------------------------------------");
        for (int j = 0; j < i; j++)
        {
            System.out.println((j + 1) + " | " + codigosCopia[j] + " | " + nombresCopia[j] + " | " + ventasCopia[j]);
        }
        System.out.println("---------------------------------------------");
    }

    private static void ReportaVentas() {
        Scanner sc = new Scanner(System.in);
        String opcDeTiempo = "";
        while (!opcDeTiempo.equals("3")) {
            System.out.println("¿En qué rango de tiempo deseas ver?");
            System.out.println("  [1] Semanal");
            System.out.println("  [2] Mensual");
            System.out.println("  [3] Salir");
            opcDeTiempo = sc.nextLine();
            switch (opcDeTiempo) {
                case "1":
                    ReporteSemanal();
                    break;
                case "2":
                    ReporteMensual();
                    break;
                default:
                    System.out.println("Ingresa opciones válidas.");
            }
        }
    }

    private static void ReporteSemanal() {
        Scanner sc = new Scanner(System.in);
        int vent = 0;
        int[] ventadiaria = new int[7];
        int TotalVenta = 0;
        System.out.println("Ingrese el código del producto que desee regsitrar la venta semanal");
        int codigo = sc.nextInt();
        sc.nextLine();
        if (producto[codigo] == null) {
            System.out.println("Producto no encontrado");
        } else {
            System.out.println("Producto: " + NomProd[codigo]);
            System.out.println("----------------------------------------");
            String[] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
            for (int j = 0; j < dia.length; j++) {
                System.out.println("Ingrese la venta del producto durante el día " + dia[j]);
                ventadiaria[vent] = sc.nextInt();
                sc.nextLine();
                TotalVenta += ventadiaria[vent];
                vent++;
            }
            System.out.println("La venta semanal del producto: " + NomProd[codigo] + " es de: " + TotalVenta);
        }
    }

    private static void ReporteMensual() {
        {
            Scanner sc = new Scanner(System.in);
            int vent = 0;
            int[] ventasemanal = new int[4];
            int TotalVenta = 0;
            System.out.println("Ingrese el código del producto que desee registrar para la venta mensual");
            int codigo = sc.nextInt();
            sc.nextLine();
            if (producto[codigo] == null) {
                System.out.println("Producto no encontrado");
            } else {
                System.out.println("Producto: " + NomProd[codigo]);
                System.out.println("----------------------------------------");
                String[] semanas = {"Semana 1", "Semana 2", "Semana 3", "Semana 4"};
                for (int j = 0; j < semanas.length; j++) {
                    System.out.println("Ingrese la venta del producto durante la " + semanas[j]);
                    ventasemanal[vent] = sc.nextInt();
                    sc.nextLine();
                    TotalVenta += ventasemanal[vent];
                    vent++;
                }
                System.out.println("La venta mensual del producto: " + NomProd[codigo] + " es de: " + TotalVenta);
            }
        }
    }

    private static void Ventas() {
        Scanner sc = new Scanner(System.in);
        String opcVentas = "";
        while (!opcVentas.equals("3")) {
            System.out.println( "\u001B[33m __  __  ____  ____  __ __  _     ____     ____  ____    __  __ ____  __  _  _____  ____    ____ \n" +
                    "|  \\/  |/ () \\| _) \\|  |  || |__ / () \\   | _) \\| ===|   \\ \\/ /| ===||  \\| ||_   _|/ () \\  (_ (_`\n" +
                    "|_|\\/|_|\\____/|____/ \\___/ |____|\\____/   |____/|____|    \\__/ |____||_|\\__|  |_| /__/\\__\\.__)__)" );
            System.out.println("-------------------------------------------------------------------------------------------------\u001B[0m");
            System.out.println("Bienvenido al módulo de ventas, ¿qué desea realizar?\n  1. Registrar ventas\n  2. Ir a la calculadora\n  3. Salir");
            opcVentas = sc.nextLine();
            switch (opcVentas) {
                case "1":
                    ReportedeVentas();
                    break;
                case "2":
                    Calculadora();
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    private static void Calculadora() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String opcCalculadora = "";
        double[] suma = new double[30];
        int o = 0;
        while (o == 0) {
            System.out.print("Ingrese el valor del producto: ");
            suma[count] = sc.nextDouble();
            sc.nextLine();
            count++;
            System.out.println("¿Deseas agregar más productos?\n  1. Si\n  2. No");
            opcCalculadora = sc.nextLine();
            if (opcCalculadora.equals("2")) {
                o++;
            }
        }
        double total = 0;
        for (int j = 0; j < count; j++) {
            total += suma[j];
        }
        System.out.println("El total a pagar es: " + total);
    }


    private static void ReportedeVentas() {
        int vent = 0;
        int Código = 0;
        System.out.println("Bienvenido al reporte de ventas");
        String desci = "";
        Scanner scanner =new Scanner(System.in);
        do
        {
        System.out.println("Por favor ingresa el código del producto vendido:");
        Código = scanner.nextInt();
        scanner.nextLine();
        if (Código < 0 || Código >= i || NomProd[Código] == null)
        {
            System.out.println("Código no valido");
        }
        else
        {
            NomProduc = NomProd[Código];
            double Precio = PSug[ Código ];
            System.out.println("Producto agregado: " + NomProduc + " - $" + Precio);
            arrventa[vent] = NomProduc + " -$" + Precio + ";";
            vent++;
            cantidadventa[Código]++;
            ExistProd[Código]--;
            producto[Código] = "Código: " + Código + " | " +
                    "Nombre: " + NomProd[Código] + " | " +
                    "Precio: $" + PrecProd[Código] + " | " +
                    "Cantidad: " + ExistProd[Código] + " | " +
                    "Precio sugerido: $" + PSug[Código] + " | " +
                    "Veces vendido: " + cantidadventa[Código];
            guardararchivo();
        }

        System.out.println("¿Deseas ingresar otro producto?\n  1. si\n  2. no");
        desci = scanner.nextLine();
    }
        while (desci.equals("1"));

        System.out.println("--- Venta Registrada ---");
        for (e = 0; e < vent; e++) {
        System.out.println(arrventa[e]);
    }
        guardararchivo();
}


private static void Inventario() {
        Scanner sc = new Scanner(System.in);
        Log = 0;
        while (Log == 0) {
            LoginBasico();
        }
        String opcInventario = "";
        while (!opcInventario.equals("4")) {
            System.out.println( "\u001B[35m _  __  _ __  __ ____  __  _  _____  ____  _____  _  ____ \n" +
                    "| ||  \\| |\\ \\/ /| ===||  \\| ||_   _|/ () \\ | () )| |/ () \\\n" +
                    "|_||_|\\__| \\__/ |____||_|\\__|  |_| /__/\\__\\|_|\\_\\|_|\\____/" );
            System.out.println("----------------------------------------------------------\u001B[0m");
            System.out.println("¿Qué desea realizar?\n  1. Productos\n  2. Eliminar productos\n  3. Cambiar precio de un producto\n  4. Salir");
            opcInventario = sc.nextLine();
            switch (opcInventario) {
                case "1":
                    Productos();
                    break;
                case "2":
                    EliminarProductos();
                    break;
                case "3":
                    CambiodePrecio();
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");

                    break;
            }
        }
    }

    private static void CambiodePrecio()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el código del producto:");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.println(producto[codigo]);
        if (producto[codigo] == null) {
            System.out.println("Producto no encontrado.");
            return;
        }
        System.out.println("¿Deseas actualizar el precio del producto?\n  [1] Sí\n  [2] No");
        String opcactualizar = sc.nextLine();
        switch (opcactualizar) {
            case "1":
                System.out.print("Ingrese el nuevo precio del producto: ");
                PrecProd[codigo] = sc.nextDouble();
                sc.nextLine();
                PSug[codigo] = PrecProd[codigo] + (PrecProd[codigo] * 0.30);
                producto[codigo] = "Código: " + codigo + " | " +
                        "Nombre: " + NomProd[codigo] + " | " +
                        "Precio: " + PrecProd[codigo] + " | " +
                        "Cantidad: " + ExistProd[codigo] + " | " +
                        "Precio sugerido: " + PSug[codigo] + " | " +
                        "Veces vendido: " + cantidadventa[codigo];
                System.out.println("Precio actualizado correctamente.");
                break;
            case "2":
                System.out.println("Saliendo.........");
                break;
            default:
                break;
        }
        guardararchivo();
    }

    private static void EliminarProductos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el código del producto que desees borrar: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        if (codigo < 0 || codigo >= i) {
            System.out.println("Producto no encontrado.");
            return;
        }
        System.out.println("¿Estas seguro?\n  1. Sí\n  2. No");
        String estado = sc.nextLine();
        if (estado.equals("1")) {
            for (int j = codigo; j < i - 1; j++) {
                NomProd[j] = NomProd[j + 1];
                PrecProd[j] = PrecProd[j + 1];
                ExistProd[j] = ExistProd[j + 1];
                PSug[j] = PSug[j + 1];
                producto[j] = "Código: " + j + " | " + "Nombre: " + NomProd[j] + " | " + "Precio: $" + PrecProd[j] + " | " + "Cantidad: " + ExistProd[j] + " | " + "Precio sugerido: $" + PSug[j];
            }
            NomProd[i - 1] = null;
            PrecProd[i - 1] = 0;
            ExistProd[i - 1] = 0;
            PSug[i - 1] = 0;
            producto[i - 1] = null;
            i--;
        }
        if (estado.equals("2")){
            System.out.println( "Saliendo..." );
        } else {
            System.out.println( "Ingrese un caracter válido");
        }
        guardararchivo();
    }

    private static void Productos() {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        int k = 0;
        System.out.println("¿Qué deseas hacer?\n  1. Ver los productos registrados\n  2. Agregar productos");
        String opcInventario = sc.nextLine();
        if (opcInventario.equals("2")) {
            while (j == 0) {
                System.out.println("Ingresa el nombre del producto: ");
                NomProd[i] = sc.nextLine();
                System.out.println("Ingresa el precio del producto: ");
                PrecProd[i] = sc.nextInt();
                sc.nextLine();
                PSug[i] = (double) (PrecProd[i] + (PrecProd[i] * 0.30));
                System.out.println("Ingresa el número de existencias del producto: ");
                ExistProd[i] = sc.nextInt();
                sc.nextLine();
                producto[i] = "Código: " + i + " | " + "Nombre: " + NomProd[i] + " | " + "Precio: $" + PrecProd[i] + " | " + "Cantidad: " + ExistProd[i] + " | " + "Precio sugerido: $" + PSug[i] + " | " + "Veces vendido: " + cantidadventa[i];
                System.out.println("¿Desea agregar más productos?\n  1. Si\n  2. No");
                String Elec = sc.nextLine();
                if (Elec.equals("2")) {
                    j++;
                }
                i++;
            }
            for (k = 0; k < i; k++) {
                System.out.println(producto[k]);
            }
            guardararchivo();
        } else {
            if (producto[k] == null) {
                System.out.println("No hay nigún producto registrado");
            } else {
                for (k = 0; k < i; k++) {
                    System.out.println(producto[k]);
                }
            }
        }
        if (!opcInventario.equals("1") && !opcInventario.equals("2")) {
            System.out.println("Opción inválida");
            return;
        }
    }

    private static void LoginBasico() {
        Scanner sc = new Scanner(System.in);
        Log = 0;
        String usuarioCorrecto = "admin";
        String passwordCorrecta = "1234";
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String pass = sc.nextLine();
        if (usuario.equals(usuarioCorrecto) && pass.equals(passwordCorrecta)) {
            System.out.println("Acceso permitido.");
            Log = 1;
        }
    }

    private static void cargararchivo() {
        try {
            File file = new File("Productos.txt");
            if (!file.exists()) {
                System.out.println("No hay archivo de productos aún.");
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;
            i = 0;
            br.mark(500);
            linea = br.readLine();
            if (linea != null && linea.startsWith("Código:")) {
                br.reset();
            }
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                String[] partes = linea.split(" \\| ");
                if (partes.length != 5) continue;
                int codigo = Integer.parseInt(partes[0].replace("Código:", "").trim());
                String nombre = partes[1].replace("Nombre:", "").trim();
                double precio = Double.parseDouble(partes[2].replace("Precio:", "").trim());
                int cantidad = Integer.parseInt(partes[3].replace("Cantidad:", "").trim());
                double sugerido = Double.parseDouble(partes[4].replace("Precio sugerido:", "").trim());
                NomProd[i] = nombre;
                PrecProd[i] = precio;
                ExistProd[i] = cantidad;
                PSug[i] = sugerido;
                producto[i] = linea;
                i++;
            }
            br.close();
            System.out.println("Productos cargados correctamente desde el archivo.");
        } catch (Exception e) {
            System.out.println("Error al cargar productos: " + e.getMessage());
        }
    }

    private static void guardararchivo() {
        try {
            FileWriter fw = new FileWriter("Productos.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("=== LISTA DE PRODUCTOS REGISTRADOS ===");
            for (int j = 0; j < i; j++) {
                if (producto[j] != null && !producto[j].isEmpty())
                    pw.println(producto[j]);
            }
            pw.close();
            System.out.println("....Cambios guardados correctamente.....");
        } catch (Exception e) {
            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    }
    private static void Limpiar() {
        for ( int clear = 0; clear <= 15; clear++){
            System.out.println( "\n" );
        }
    }
}