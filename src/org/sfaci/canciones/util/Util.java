package org.sfaci.canciones.util;

import javax.swing.*;

public class Util {

    public static void mensajeError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null,
                mensaje, titulo,
                JOptionPane.ERROR_MESSAGE);
    }

    public static void mensajeInformacion(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null,
                mensaje, titulo,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null,
                mensaje, "Info: ",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
