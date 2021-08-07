package lab3p2_andyvelasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_AndyVelasquez {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList r = new ArrayList();
        ArrayList a = new ArrayList();
        ArrayList<Admi> rr = new ArrayList();
        ArrayList<Programador> p = new ArrayList();
        ArrayList<Motorista> m = new ArrayList();
        ArrayList<Cliente> c = new ArrayList();
        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = entrada.next();

        System.out.println("Ingrese su contraseña: ");
        String contra = entrada.next();

        if (usuario.contains("david") && contra.contains("1234")) {
            System.out.println("Bienvenido A Hugo\n");
            int opcion = 0;
            while (opcion != 5) {
                System.out.println("        |Menu|      ");
                System.out.println(" 1. Crear Restaurante");
                System.out.println(" 2. Crear Tienda");
                System.out.println(" 3. Crear Empleados");
                System.out.println(" 4. crear Clientes");
                System.out.println(" 5. Salir");
                System.out.println("Que opcion desea: ");
                opcion = entrada.nextInt();
                System.out.println("\n");
                switch (opcion) {
                    case 1: {
                        System.out.println("Que desea hacer?\n"
                                + " 1. Crear Restaurante \n"
                                + " 2. Crear Comida\n"
                                + " 3. Listar\n"
                                + " 4.Modificar Restaurante\n"
                                + " 5. Elimina\n"
                                + " 6.Salir ");
                        int op = entrada.nextInt();
                        System.out.println("\n");
                        switch (op) {
                            case 1: {

                                System.out.println("Nombre el restaurante ");
                                String res = entrada.next();

                                System.out.println("Ubicacion");
                                String ubica = entrada.next();

                                System.out.println("RTN");
                                int rtn = entrada.nextInt();

                                System.out.println("Ingrese slogan");
                                String slogan = entrada.next();

                                r.add(new Restaurante(res, ubica, rtn, slogan));
                                System.out.println("Restaurante creado con exito ");
                                break;

                            }//fin case 1.2
                            case 2: {
                                String tipo = "";
                                System.out.println("Comida ");

                                System.out.println("Nombre de comida ");
                                String comida = entrada.next();

                                System.out.println("Id");
                                int id = entrada.nextInt();

                                System.out.println("Precio");
                                int precio = entrada.nextInt();

                                System.out.println("Cantidad de acompaniamientos");
                                int can = entrada.nextInt();

                                System.out.println("Acompaniamientos ");
                                System.out.println("Tipos ");
                                System.out.println("1.Asado ");
                                System.out.println("2.Frito\n"
                                        + "3.Pan\n"
                                        + "4.Salsa ");
                                int num = entrada.nextInt();
                                if (num == 1) {
                                    tipo = "Asado";

                                }
                                if (num == 2) {
                                    tipo = "Frito";

                                }
                                if (num == 3) {
                                    tipo = "Pan";

                                }
                                if (num == 4) {
                                    tipo = "Salsa";

                                }
                                System.out.println("Precio adicional de acompanimiento");
                                int precioa = entrada.nextInt();

                                r.add(new Restaurante(comida, id, precio, can, tipo, precioa));
                                System.out.println("Comida creada con exito ");
                                break;
                            }//fin case 2.1
                            case 3: {
                                System.out.println("\n        Listas         \n");
                                String salida = "";
                                for (Object t : r) {
                                    if (t instanceof Restaurante) {
                                        salida += r.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida);
                                break;
                            }//fin case 3.1
                            case 4: {
                                System.out.println("\n        Modificacion del restaurante         \n");
                                System.out.println("Ingrese posición a modificar");
                                int pos = entrada.nextInt();
                                if (r.get(pos) instanceof Restaurante) {
                                    System.out.println("Que desea modificar?\n"
                                            + " 1. Nombre del restaurante\n"
                                            + " 2. ubicacion\n"
                                            + " 3. RTN\n"
                                            + " 4. Slogan \n"
                                            + " 5. Nuevo nombre de comida\n"
                                            + " 6. Presio nuevo de comida\n"
                                            + " 7. Cantidad de acompaniamiento\n"
                                            + " 8.Precio adicional");
                                    int mod = entrada.nextInt();//
                                    switch (mod) {
                                        case 1: {
                                            System.out.println("Ingrese su nuevo nombre: ");
                                            String res = entrada.next();
                                            ((Restaurante) r.get(pos)).setIdenti(res);
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("Ingrese su nuevo ubicacion: ");
                                            String ubicacione = entrada.next();
                                            ((Restaurante) r.get(pos)).setUbica(ubicacione);
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("Ingrese su nuevo RTN: ");
                                            int rtn = entrada.nextInt();
                                            ((Restaurante) r.get(pos)).setRtn(rtn);
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Ingrese su nuevo Slogan: ");
                                            String slogan = entrada.next();
                                            ((Restaurante) r.get(pos)).setSlogan(slogan);
                                            break;
                                        }
                                        case 5: {
                                            System.out.println("Ingrese su nuevo nombre de comida: ");
                                            String comida = entrada.next();
                                            ((Restaurante) r.get(pos)).setComida(comida);
                                            break;
                                        }
                                        case 6: {
                                            System.out.println("Ingrese su nuevo Precio de comida: ");
                                            int nu = entrada.nextInt();
                                            ((Restaurante) r.get(pos)).setPrecio(nu);
                                            break;
                                        }
                                        case 7: {
                                            System.out.println("Ingrese cantidad de acompaniamiento: ");
                                            int nu = entrada.nextInt();
                                            ((Restaurante) r.get(pos)).setCantida(nu);
                                            break;
                                        }
                                        case 8: {
                                            System.out.println("Presio Adicional: ");
                                            int nu = entrada.nextInt();
                                            ((Restaurante) r.get(pos)).setPrecioa(nu);
                                            break;
                                        }
                                    }
                                    System.out.println("Modificacion creada con exito ");
                                } else {
                                    System.out.println("Posicion no valida");
                                }

                                break;
                            }//case 4.1
                            case 5: {
                                System.out.println("Ingrsese posición a eliminar");
                                int posicion = entrada.nextInt();
                                if (r.get(posicion) instanceof Restaurante) {
                                    r.remove(posicion);
                                } else {
                                    System.out.println("Posicion no valida");
                                }
                                break;
                            }//fin de case 5.1

                            default:
                                System.out.println("Solo tenemos esas opciones");

                        }//fin 2switch
                    }///fin case 1
                    break;
                    case 2: {
                        System.out.println("\n            *|Tiendas|*           \n");

                        System.out.println("Que desea ingresar \n"
                                + "1. Anadir tiendas\n"
                                + "2. Añadir Arituclos\n"
                                + "3.Lista de articulos y tienda"
                        );
                        int op = entrada.nextInt();
                        switch (op) {
                            case 1: {
//                     
                                System.out.println("Ingresar nombre de la tienda: ");
                                String nombre = entrada.next();

                                System.out.println("Ingrese Ubicacion mas cercana : ");
                                String ubica = entrada.next();

                                System.out.println("Cantidad de empleados : ");
                                int Can = entrada.nextInt();

                                System.out.println("Tiempo de espera para preparacion de articulos: ");
                                String tiempo = entrada.next();
                                a.add(new Tienda(nombre, ubica, Can, tiempo));
                                System.out.println("Tienda creada con exito ");
                                break;
                            }// fin case 2.1
                            case 2: {
                                String cate = "";
                                System.out.println("Articulos ");
                                System.out.println("Nombre del articulo : ");

                                String nombre = entrada.next();
                                System.out.println("Categoria \n"
                                        + "1. Limpieza\n"
                                        + "2. Ocio\n"
                                        + "3. Lectura\n"
                                        + "4. Otro  ");
                                int tipo = entrada.nextInt();
                                if (tipo == 1) {
                                    cate = "Limpieza";
                                }
                                if (tipo == 2) {
                                    cate = "Ocio";
                                }
                                if (tipo == 3) {
                                    cate = "Lectura";
                                }
                                if (tipo == 4) {
                                    System.out.println("Ingrese que otro categoria : ");
                                    cate = entrada.next();
                                }

                                System.out.println("Ingrese Precio: ");
                                int precio = entrada.nextInt();
                                String nose = "";

                                a.add(new Articulo(nombre, cate, precio, nose, nose, 0, nose));
                                break;
                            }// fi case 2.2
                            case 3: {
                                System.out.println("\n        Listas de tiendas y Articulos         \n");
                                String salida = "";
                                for (Object t : a) {
                                    if (t instanceof Tienda) {
                                        salida += a.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida);
                            }
                            case 4: {
                                /* System.out.println("\n        Listas de comida       \n");
                                String salida = "";
                                for (Object t : a) {
                                    if (t instanceof Comida) {
                                        salida += a.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida);*/

                            }
                        }

                        break;
                    }// fin de case 2
                    default:
                        System.out.println("No hay mas opciones");
                    case 3: {
                        System.out.println("Que desea hacer?\n"
                                + " 1. Administradores \n"
                                + " 2. Programadores"
                                + " 3. Motoristas \n"
                                + " 4. Salir\n"
                        );
                        int op = entrada.nextInt();
                        System.out.println("\n");
                        switch (op) {
                            case 1: {
                                System.out.println("Que desea hacer?\n"
                                        + " 1. Crear \n"
                                        + " 2. listar\n"
                                        + " 3. modificar \n"
                                        + " 4. eliminar\n"
                                        + "5.salir"
                                );
                                int op2 = entrada.nextInt();

                                switch (op2) {
                                    case 1: {
                                        System.out.println("\n            *|Adminitradores|*           ");
                                        System.out.println("Usuario");
                                        String usuari = entrada.next();
                                        System.out.println("Contrasena");
                                        String contrasena = entrada.next();
                                        System.out.println("Ingrese el nombre");
                                        String nombre1 = entrada.next();

                                        System.out.println("Ingrese el apellido");
                                        String apellido1 = entrada.next();

                                        System.out.println("Id");
                                        int id = entrada.nextInt();

                                        System.out.println("Puesto");
                                        String puesto = entrada.next();

                                        System.out.println("Anos que a tenia el cargo ");
                                        int anos = entrada.nextInt();

                                        System.out.println("Salrio base ");
                                        int base = entrada.nextInt();

                                        System.out.println("Anos de experiencia ");
                                        String expe = entrada.next();
                                        rr.add(new Admi(usuari, contrasena, nombre1, apellido1, id, puesto, anos, base, expe));
                                        System.out.println("Adminitrador creado con exito ");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("\n        Listas         \n");
                                        String salida = "";
                                        for (Object t : rr) {
                                            if (t instanceof Admi) {
                                                salida += rr.indexOf(t) + "- " + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        break;

                                    }
                                    case 3: {
                                        System.out.println("\n        Modificacion de adminitrador          \n");
                                        System.out.println("Ingrese posición a modificar");
                                        int pos = entrada.nextInt();
                                        if (r.get(pos) instanceof Restaurante) {
                                            System.out.println("Que desea modificar?\n"
                                                    + " 1. Nombre \n"
                                                    + " 2. Apelldio\n"
                                                    + " 3. Id\n"
                                                    + " 4. Puesto \n"
                                                    + " 5. Anos que a tenido el cargo \n"
                                                    + " 6. Salario base\n"
                                                    + " 7. Anos de experienecia en venta\n"
                                                    + " 8.Usuario\n"
                                                    + " 9. Contrasena");
                                            int mod = entrada.nextInt();//
                                            switch (mod) {
                                                case 1: {
                                                    System.out.println("Ingrese su nuevo nombre: ");
                                                    String res = entrada.next();
                                                    ((Admi) rr.get(pos)).setNombre(res);
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("Ingrese su nuevo apellido: ");
                                                    String apel = entrada.next();
                                                    ((Admi) rr.get(pos)).setApellido(apel);
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Ingrese su nuevo Id: ");
                                                    int rtn = entrada.nextInt();
                                                    ((Admi) rr.get(pos)).setId(rtn);
                                                    break;
                                                }
                                                case 4: {
                                                    System.out.println("Ingrese su nuevo Puesto: ");
                                                    String res = entrada.next();
                                                    ((Admi) rr.get(pos)).setPuesto(res);
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("Ingrese anos de cargo: ");
                                                    int comida = entrada.nextInt();
                                                    ((Admi) rr.get(pos)).setAnos(comida);
                                                    break;
                                                }
                                                case 6: {
                                                    System.out.println("Ingrese su nuevo salario base: ");
                                                    int nu = entrada.nextInt();
                                                    ((Admi) rr.get(pos)).setBase(nu);
                                                    break;
                                                }
                                                case 7: {
                                                    System.out.println("Ingrese anos de experiencia: ");
                                                    int nu = entrada.nextInt();
                                                    ((Admi) rr.get(pos)).setAnos(nu);
                                                    break;
                                                }
                                                case 8: {
                                                    System.out.println("Nuevo usuario: ");
                                                    String nu = entrada.next();
                                                    ((Admi) rr.get(pos)).setUsuario(nu);
                                                    break;
                                                }
                                                case 9: {
                                                    System.out.println("Nuevo contrasena: ");
                                                    String nu = entrada.next();
                                                    ((Admi) rr.get(pos)).setContra(nu);
                                                    break;
                                                }

                                            }
                                            System.out.println("Modificacion creada con exito ");
                                        } else {
                                            System.out.println("Posicion no valida");
                                        }
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("Ingrsese posición a eliminar");
                                        int posicion = entrada.nextInt();
                                        if (rr.get(posicion) instanceof Admi) {
                                            rr.remove(posicion);
                                        } else {
                                            System.out.println("Posicion no valida");
                                        }

                                    }
                                }/////////////////////////////1
                                break;
                            }// fi case 3.1.1
                            case 2: {
                                System.out.println("Que desea hacer?\n"
                                        + " 1. Crear \n"
                                        + " 2. listar\n"
                                        + " 3. modificar \n"
                                        + " 4. eliminar\n"
                                        + "5.salir"
                                );
                                int op2 = entrada.nextInt();

                                switch (op2) {
                                    case 1: {
                                        System.out.println("\n            *|Programadores|*           ");
                                        System.out.println("Usuario");
                                        String usuari = entrada.next();
                                        System.out.println("Contrasena");
                                        String contrasena = entrada.next();
                                        System.out.println("Ingrese el nombre");
                                        String nombre1 = entrada.next();

                                        System.out.println("Ingrese el apellido");
                                        String apellido1 = entrada.next();

                                        System.out.println("Id");
                                        int id = entrada.nextInt();

                                        System.out.println("Puesto");
                                        String puesto = entrada.next();

                                        System.out.println("Anos que a tenia el cargo ");
                                        int anos = entrada.nextInt();

                                        System.out.println("Salrio base ");
                                        int base = entrada.nextInt();

                                        System.out.println("Lenguajes de programacion que domina ");
                                        String lengua = entrada.next();
                                        System.out.println("Horario de trabajo ");
                                        int hora = entrada.nextInt();
                                        p.add(new Programador(usuari, contrasena, nombre1, apellido1, id, puesto, anos, base, lengua, hora));
                                        System.out.println("Programador creado con exito ");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("\n        Listas         \n");
                                        String salida = "";
                                        for (Object t : p) {
                                            if (t instanceof Programador) {
                                                salida += p.indexOf(t) + "- " + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        break;

                                    }
                                    case 3: {
                                        System.out.println("\n        Modificacion de Programador         \n");
                                        System.out.println("Ingrese posición a modificar");
                                        int pos = entrada.nextInt();
                                        if (r.get(pos) instanceof Restaurante) {
                                            System.out.println("Que desea modificar?\n"
                                                    + " 1. Nombre \n"
                                                    + " 2. Apelldio\n"
                                                    + " 3. Id\n"
                                                    + " 4. Puesto \n"
                                                    + " 5. Anos que a tenido el cargo \n"
                                                    + " 6. Salario base\n"
                                                    + " 7. Lengua que domina\n"
                                                    + " 8.Hora"
                                                    + " 9.Usuario\n"
                                                    + " 10. Contrasena");
                                            int mod = entrada.nextInt();//
                                            switch (mod) {
                                                case 1: {
                                                    System.out.println("Ingrese su nuevo nombre: ");
                                                    String res = entrada.next();
                                                    ((Programador) p.get(pos)).setNombre(res);
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("Ingrese su nuevo apellido: ");
                                                    String apel = entrada.next();
                                                    ((Programador) p.get(pos)).setApellido(apel);
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println("Ingrese su nuevo Id: ");
                                                    int nu = entrada.nextInt();
                                                    ((Programador) p.get(pos)).setId(nu);
                                                    break;
                                                }
                                                case 4: {
                                                    System.out.println("Ingrese su nuevo Puesto: ");
                                                    String res = entrada.next();
                                                    ((Programador) p.get(pos)).setPuesto(res);
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("Ingrese anos de cargo: ");
                                                    int comida = entrada.nextInt();
                                                    ((Programador) p.get(pos)).setAnos(comida);
                                                    break;
                                                }
                                                case 6: {
                                                    System.out.println("Ingrese su nuevo salario base: ");
                                                    int nu = entrada.nextInt();
                                                    ((Programador) p.get(pos)).setBase(nu);
                                                    break;
                                                }
                                                case 7: {
                                                    System.out.println("Lengua que domina: ");
                                                    int nu = entrada.nextInt();
                                                    ((Programador) p.get(pos)).setAnos(nu);
                                                    break;
                                                }
                                                case 8: {
                                                    System.out.println("Nuevo hora de trabajo: ");
                                                    int nu = entrada.nextInt();
                                                    ((Programador) p.get(pos)).setHora(nu);
                                                    break;

                                                }
                                                case 9: {
                                                    System.out.println("Nuevo usuario: ");
                                                    String nu = entrada.next();
                                                    ((Admi) rr.get(pos)).setUsuario(nu);
                                                    break;
                                                }
                                                case 10: {
                                                    System.out.println("Nuevo contrasena: ");
                                                    String nu = entrada.next();
                                                    ((Admi) rr.get(pos)).setContra(nu);
                                                    break;
                                                }

                                            }
                                            System.out.println("Modificacion creada con exito ");
                                        } else {
                                            System.out.println("Posicion no valida");
                                        }
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("Ingrese posición a eliminar");
                                        int posicion = entrada.nextInt();
                                        if (p.get(posicion) instanceof Programador) {
                                            p.remove(posicion);
                                        } else {
                                            System.out.println("Posicion no valida");
                                        }

                                    }
                                }/////////////////////////////1

                                break;
                            }// fi case 3.1.2
                            case 3: {
                                System.out.println("Que desea hacer?\n"
                                        + " 1. Crear \n"
                                        + " 2. listar\n"
                                        + " 3. eliminar\n"
                                        + "4.salir"
                                );
                                int op2 = entrada.nextInt();

                                switch (op2) {
                                    case 1: {
                                        String no = "";
                                        System.out.println("\n            *|Motoristas|*           ");
                                        System.out.println("Usuario");
                                        String usuari = entrada.next();
                                        System.out.println("Contrasena");
                                        String contrasena = entrada.next();
                                        System.out.println("Ingrese el nombre");
                                        String nombre1 = entrada.next();

                                        System.out.println("Ingrese el apellido");
                                        String apellido1 = entrada.next();

                                        System.out.println("Id");
                                        int id = entrada.nextInt();

                                        System.out.println("Puesto");
                                        String puesto = entrada.next();

                                        System.out.println("Anos que a tenia el cargo ");
                                        int anos = entrada.nextInt();

                                        System.out.println("Salario base ");
                                        int base = entrada.nextInt();

                                        System.out.println("Comisiones ");
                                        String comision = entrada.next();
                                        System.out.println("Medio de tramporte  ");
                                        String medio = entrada.next();
                                        System.out.println("Cantidad que puede llevar ala a ves  ");
                                        int can = entrada.nextInt();

                                        m.add(new Motorista(usuari, contrasena, nombre1, apellido1, id, puesto, anos, base, comision, medio, can, "", "", "", "", 0, "", 0, 0, "", 0));
                                        System.out.println("Motorista creado con exito ");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("\n        Listas         \n");
                                        String salida = "";
                                        for (Object t : m) {
                                            if (t instanceof Motorista) {
                                                salida += m.indexOf(t) + "- " + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        break;

                                    }
                                    case 3: {

                                        System.out.println("Ingrese posición a eliminar");
                                        int posicion = entrada.nextInt();
                                        if (p.get(posicion) instanceof Programador) {
                                            p.remove(posicion);
                                        } else {
                                            System.out.println("Posicion no valida");
                                        }

                                    }
                                }/////////////////////////////1

                                break;
                            }/// fin case 3.1.3
                        }/////////////
                        break;
                    }//fin del case 3
                    case 4: {
                        System.out.println("Que desea hacer?\n"
                                + " 1. Crear \n"
                                + " 2. listar\n"
                                + " 3. Pedir \n"
                                + " 4. eliminar\n"
                                + "5.salir"
                        );
                        int op2 = entrada.nextInt();

                        switch (op2) {
                            case 1: {
                                System.out.println("\n            *|Clientes*           ");
                                System.out.println("Usuario");
                                String usuari = entrada.next();
                                System.out.println("Contrasena");
                                String contrasena = entrada.next();
                                System.out.println("Ingrese el nombre");
                                String nombre1 = entrada.next();

                                System.out.println("Ingrese el apellido");
                                String apellido1 = entrada.next();

                                System.out.println("Id");
                                int id = entrada.nextInt();

                                System.out.println("Domicilio");
                                String puesto = entrada.next();

                                System.out.println("Cantidad de veces que a pedido en la aplicacion ");
                                int anos = entrada.nextInt();

                                c.add(new Cliente(usuari, contrasena, nombre1, apellido1, id, puesto, anos));
                                System.out.println("Cliente creado con exito ");
                                break;
                            }
                            case 2: {
                                System.out.println("\n        Listas         \n");
                                String salida = "";
                                for (Object t : c) {
                                    if (t instanceof Cliente) {
                                        salida += c.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida);
                                break;

                            }
                            case 3: {
                                System.out.println("\n        No logre aser pedido          \n");

                                break;
                            }
                            case 4: {
                                System.out.println("Ingrsese posición a eliminar");
                                int posicion = entrada.nextInt();
                                if (c.get(posicion) instanceof Cliente) {
                                    c.remove(posicion);
                                } else {
                                    System.out.println("Posicion no valida");
                                }

                            }
                        }/////////////////////////////1
                        break;
                    }
                }//fin switch
            }//fin del while principal m

        }// fin del login 

    }// fin del main

}// fin de la clase 
///////////bien 
