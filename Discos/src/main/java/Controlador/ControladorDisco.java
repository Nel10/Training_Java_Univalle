/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloDiscos;
import Vista.DiscosVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author holberton
 */
public class ControladorDisco implements ActionListener {
    DiscosVista vista;
    ModeloDiscos modelo;

    public ControladorDisco() {
        this.vista = new DiscosVista();
        this.modelo = new ModeloDiscos();
        vista.getBtnAñadir().addActionListener(this);
        vista.getBtnGuardar().addActionListener(this);
        vista.getCbxBuscar().addActionListener(this);
        
    }
    public void iniciar() {
        vista.setVisible(true);
        
}

    @Override
    public void actionPerformed(ActionEvent e) {
        // Verificar qué componente generó el evento
        if (e.getSource() == vista.getBtnAñadir()) {
            // Si el evento fue generado por el botón "Añadir", llamar al método para añadir la canción
            añadirCancion();
        } else if (e.getSource() == vista.getBtnGuardar()) {
            // Si el evento fue generado por el botón "Guardar", llamar al método para guardar las canciones
            guardarCanciones();
        } else if (e.getSource() == vista.getCbxBuscar()) {
            // Si el evento fue generado por el campo de búsqueda, llamar al método para buscar una canción
            buscarCancion();
        }
    }

    // Método para añadir una canción
    private void añadirCancion() {
        String cancion = vista.getTxtCanciones().getText();

        // Verificar que el campo de canción no esté vacío
        if (!cancion.isEmpty()) {
            // Recuperar la lista actual de canciones
            String[] cancionesActuales = modelo.getListaCanc();

            // Crear un nuevo array de canciones con espacio para una nueva
            String[] nuevaListaCanciones = new String[cancionesActuales.length + 1];

            // Copiar las canciones actuales al nuevo array
            System.arraycopy(cancionesActuales, 0, nuevaListaCanciones, 0, cancionesActuales.length);

            // Agregar la nueva canción al final
            nuevaListaCanciones[nuevaListaCanciones.length - 1] = cancion;

            // Actualizar el modelo con la nueva lista de canciones
            modelo.setListaCanc(nuevaListaCanciones);

            // Mostrar las canciones en el área de texto de la vista (para ver las canciones añadidas)
            vista.getTxtaCanciones().append(cancion + "\n");

            // Limpiar el campo de texto para agregar otra canción si se desea
            vista.getTxtCanciones().setText(""); // Limpiar solo el campo de canción
        } else {
            // Si no hay canción ingresada, mostrar un mensaje de advertencia
            JOptionPane.showMessageDialog(vista, "Por favor, ingresa el nombre de la canción.");
        }
    }

    // Método para guardar las canciones
    private void guardarCanciones() {
    // Obtener los datos del álbum y el artista desde la vista
        String album = vista.getTxtnombreAlb().getText();
        String artista = vista.getTxtnombreArt().getText();

        // Validar que todos los campos estén llenos
        if (!album.isEmpty() && !artista.isEmpty()) {
            // Crear un nuevo objeto ModeloDiscos con los datos del álbum y las canciones
            ModeloDiscos nuevoCD = new ModeloDiscos(album, artista, modelo.getListaCanc());

            // Agregar el CD a la lista global de CDs
            ModeloDiscos.agregarCD(nuevoCD);  // Llamamos al método estático para agregar el CD

            // Limpiar los campos de la vista
            vista.getTxtnombreAlb().setText("");
            vista.getTxtnombreArt().setText("");
            vista.getTxtaCanciones().setText(""); // Limpiar las canciones
            vista.getTxtCanciones().setText(""); // Limpiar el campo de la canción

            // Limpiar la lista de canciones en el modelo para el próximo CD
            modelo.setListaCanc(new String[0]);

            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(vista, "El CD se ha guardado correctamente.");
        } else {
            // Si algún campo está vacío, mostrar un mensaje de error
            JOptionPane.showMessageDialog(vista, "Por favor, llena todos los campos.");
        }
    }
       
    // Método para buscar una canción
    private void buscarCancion() {
    // Obtener el criterio de búsqueda desde el JComboBox (Artista o Álbum)
        String criterio = (String) vista.getCbxBuscar().getSelectedItem();

        // Obtener el valor de búsqueda desde el campo de texto
        String valorBusqueda = vista.getTxtBuscar().getText().toLowerCase();

        // Crear un StringBuilder para mostrar los resultados
        StringBuilder resultados = new StringBuilder();

        // Filtrar los CDs según el criterio
        for (ModeloDiscos cd : ModeloDiscos.getListaCDs()) {  // Usamos la lista de CDs desde el modelo
            if (criterio.equals("Artista") && cd.getNombreArt().toLowerCase().contains(valorBusqueda)) {
                // Añadir información de Artista y Álbum
                resultados.append("Artista: " + cd.getNombreArt() + "\n");
                resultados.append("Álbum: " + cd.getNombreAlb() + "\n");

                // Concatenar las canciones en una sola línea separadas por coma
                String canciones = String.join(", ", cd.getListaCanc());
                resultados.append("Canciones: " + canciones + "\n");

            } else if (criterio.equals("Álbum") && cd.getNombreAlb().toLowerCase().contains(valorBusqueda)) {
                // Añadir información de Álbum y Artista
                resultados.append("Artista: " + cd.getNombreArt() + "\n");
                resultados.append("Álbum: " + cd.getNombreAlb() + "\n");

                // Concatenar las canciones en una sola línea separadas por coma
                String canciones = String.join(", ", cd.getListaCanc());
                resultados.append("Canciones: " + canciones + "\n");
            }
        }

        // Mostrar los resultados en el JTextArea de la vista
        if (resultados.length() > 0) {
            vista.getTxtaResultBusqueda().setText(resultados.toString());
        } else {
            vista.getTxtaResultBusqueda().setText("No se encontraron resultados.");
        }
    }

}