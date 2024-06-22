$(document).ready(function() {
    function updateEmptyMessage() {
        if ($('#listaCitas li').length === 0) {
            $('#emptyListMessage').show();
        } else {
            $('#emptyListMessage').hide();
        }
    }

    $('#agregarCita').click(function() {
        const fecha = $('#fechaCita').val();
        const cliente = $('#cliente').val();
        const servicio = $('#servicio').val();
        if (fecha && cliente && servicio) {
            const cita = `<li class="list-group-item">
                <span>
                    <strong>Fecha:</strong> ${fecha} |
                    <strong>Cliente:</strong> ${cliente} |
                    <strong>Servicio:</strong> ${servicio}
                </span>
                <button class="btn btn-danger btn-sm eliminarCita">Eliminar</button>
            </li>`;
            $('#listaCitas').append(cita);
            $('#fechaCita').val('');
            $('#cliente').val('');
            $('#servicio').val('');
            updateEmptyMessage();
        } else {
            alert('Por favor, complete todos los campos.');
        }
    });

    $('#buscarCitaBtn').click(function() {
        const search = $('#buscarCita').val().toLowerCase();
        let found = false;
        $('#listaCitas li').filter(function() {
            const match = $(this).text().toLowerCase().indexOf(search) > -1;
            $(this).toggle(match);
            if (match) {
                found = true;
            }
        });
        if (!found) {
            alert('No se ha encontrado ninguna cita.');
        }
        $('#volverBtn').show();
    });

    $('#volverBtn').click(function() {
        $('#buscarCita').val('');
        $('#listaCitas li').show();
        $('#volverBtn').hide();
    });

    $(document).on('click', '.eliminarCita', function() {
        $(this).closest('li').remove();
        updateEmptyMessage();
    });

    updateEmptyMessage(); 
});
