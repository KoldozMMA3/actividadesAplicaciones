import 'package:flutter/material.dart';

class PantallaPerfil extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Mi Perfil'),
      ),
      body: Padding(
        padding: EdgeInsets.all(20),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Center(
              child: ClipRRect(
                borderRadius: BorderRadius.circular(75),
                child: Image.network(
                  'https://cdn-icons-png.flaticon.com/512/847/847969.png',
                  height: 150,
                  width: 150,
                  fit: BoxFit.cover,
                ),
              ),
            ),
            SizedBox(height: 20),
            Center(
              child: Text(
                'Cristian Edward Carrizales Luna',
                style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
                textAlign: TextAlign.center,
              ),
            ),
            SizedBox(height: 10),
            Text('Edad: 24 años'),
            Text('Ciclo: Sexto ciclo de la carrera de Ing. de Software'),
            Text('Universidad: La Salle'),
            SizedBox(height: 10),
            Text(
              'Intereses:',
              style: TextStyle(fontWeight: FontWeight.bold),
            ),
            Text('• Realizar aplicaciones didácticas'),
            Text('• Crear cosas nuevas'),
            SizedBox(height: 20),
            Row(
              children: [
                Icon(Icons.phone),
                SizedBox(width: 10),
                Text('956 222 110'),
              ],
            ),
            SizedBox(height: 10),
            Row(
              children: [
                Icon(Icons.email),
                SizedBox(width: 10),
                Flexible(
                  child: Text('ccarrizalesl@ulasalle.edu.pe'),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
