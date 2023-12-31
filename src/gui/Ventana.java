package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.GestorArchivos;

/**
 *
 * @author Daniel Andrade
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setTitle("5 Por Favor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mascotasi = new javax.swing.JToggleButton();
        mascotano = new javax.swing.JToggleButton();
        conocidosi = new javax.swing.JToggleButton();
        conocidono = new javax.swing.JToggleButton();
        adoptarsi = new javax.swing.JToggleButton();
        adoptarno = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        nombrearchivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rutaarchivo = new javax.swing.JTextField();
        extencionarchivo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        agregar.setText("Crear Archivo");
        agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel2.add(agregar);
        agregar.setBounds(30, 310, 120, 30);

        nombre.setBackground(new java.awt.Color(204, 204, 255));
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel2.add(nombre);
        nombre.setBounds(140, 30, 170, 22);

        numero.setBackground(new java.awt.Color(204, 204, 255));
        numero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(numero);
        numero.setBounds(140, 60, 170, 22);

        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 30, 80, 20);

        jLabel2.setText("Numero:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 60, 60, 20);

        jLabel3.setText("Tiene mascotas? ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(100, 90, 90, 20);

        mascotasi.setText("si");
        mascotasi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mascotasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasiActionPerformed(evt);
            }
        });
        jPanel2.add(mascotasi);
        mascotasi.setBounds(200, 90, 50, 18);

        mascotano.setText("no");
        mascotano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mascotano);
        mascotano.setBounds(260, 90, 50, 18);

        conocidosi.setText("si");
        conocidosi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(conocidosi);
        conocidosi.setBounds(200, 120, 50, 18);

        conocidono.setText("no");
        conocidono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(conocidono);
        conocidono.setBounds(260, 120, 50, 18);

        adoptarsi.setText("si");
        adoptarsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(adoptarsi);
        adoptarsi.setBounds(200, 150, 50, 18);

        adoptarno.setText("no");
        adoptarno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(adoptarno);
        adoptarno.setBounds(260, 150, 50, 18);

        jLabel4.setText("Tiene conocidos con mascotas?");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 120, 170, 20);

        jLabel5.setText("Quiere adoptar mascotas?");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 150, 140, 20);

        salir.setText("salir");
        salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(salir);
        salir.setBounds(240, 320, 75, 18);

        nombrearchivo.setBackground(new java.awt.Color(204, 204, 255));
        nombrearchivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombrearchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrearchivoActionPerformed(evt);
            }
        });
        jPanel2.add(nombrearchivo);
        nombrearchivo.setBounds(150, 200, 170, 22);

        jLabel6.setText("Nombre del archivo");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 200, 110, 16);

        jLabel7.setText("Ruta del archivo");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 260, 90, 20);

        rutaarchivo.setBackground(new java.awt.Color(204, 204, 255));
        rutaarchivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rutaarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaarchivoActionPerformed(evt);
            }
        });
        jPanel2.add(rutaarchivo);
        rutaarchivo.setBounds(150, 260, 170, 22);

        extencionarchivo.setBackground(new java.awt.Color(204, 204, 255));
        extencionarchivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        extencionarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extencionarchivoActionPerformed(evt);
            }
        });
        jPanel2.add(extencionarchivo);
        extencionarchivo.setBounds(150, 230, 170, 22);

        jLabel8.setText("Extencion del archivo");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 230, 120, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 370, 380);

        setSize(new java.awt.Dimension(387, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {
        String mascota = "";
        String conocidos = "";
        String adoptar = "";
        String info = "";
        String nombreArch = nombrearchivo.getText()+"."+extencionarchivo.getText();
        String rutaArch = rutaarchivo.getText();
        if (mascotasi.isSelected()) {
            mascota = "Si";
        } else {

        }
        if (mascotano.isSelected()) {
            mascota = "No";
        } else {

        }
        if (mascotasi.isSelected() && mascotano.isSelected()) {
            JOptionPane.showMessageDialog(null, "Error en el dato MASCOTA");
        } else {

        }
        if (conocidosi.isSelected()) {
            conocidos = "Si";
        } else {

        }
        if (conocidono.isSelected()) {
            conocidos = "Si";
        } else {

        }
        if (conocidosi.isSelected() && conocidono.isSelected()) {
            JOptionPane.showMessageDialog(null, "Error en el dato CONOCIDOS");
        } else {

        }
        if (adoptarsi.isSelected()) {
            adoptar = "Si";
        } else {

        }
        if (adoptarno.isSelected()) {
            adoptar = "Si";
        } else {

        }
        if (adoptarsi.isSelected() && adoptarno.isSelected()) {
            JOptionPane.showMessageDialog(null, "Error en el dato ADOPCION.");
        }
        info = "Nombre: " + nombre.getText() + "/Numero: " + numero.getText() + "/Mascotas?" + mascota + "/Conocidos con mascota?: " + conocidos + "/Quiere adoptar una nueva mascota?:" + adoptar;
        ingresar(info, nombreArch, rutaArch);
    }
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mascotasiActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nombrearchivoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void rutaarchivoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void extencionarchivoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JToggleButton adoptarno;
    private javax.swing.JToggleButton adoptarsi;
    private javax.swing.JButton agregar;
    private javax.swing.JToggleButton conocidono;
    private javax.swing.JToggleButton conocidosi;
    private javax.swing.JTextField extencionarchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton mascotano;
    private javax.swing.JToggleButton mascotasi;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombrearchivo;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField rutaarchivo;
    private javax.swing.JButton salir;
    // End of variables declaration

    private void ingresar(String informacion, String nombre, String ruta) {
        List<String> lista = new ArrayList<>();
        lista.add(informacion);
        Boolean inserto = GestorArchivos.guardarInfo(lista, nombre, ruta);
        if (inserto) {
            JOptionPane.showMessageDialog(null, "El archivo: " + nombre + " fue guardado en: " + ruta + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Error al guarda el archivo.");
        }
    }

    private void salir() {
        System.exit(0);
    }
}
