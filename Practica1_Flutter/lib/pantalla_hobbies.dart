import 'package:flutter/material.dart';

class PantallaHobbies extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Mis Hobbies'),
      ),
      body: Padding(
        padding: EdgeInsets.all(20),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Row(
              children: [
                Icon(Icons.sports_basketball),
                SizedBox(width: 10),
                Text('Jugar básquet'),
              ],
            ),
            SizedBox(height: 10),
            Row(
              children: [
                Icon(Icons.computer),
                SizedBox(width: 10),
                Text('Programar'),
              ],
            ),
            SizedBox(height: 10),
            Row(
              children: [
                Icon(Icons.directions_run),
                SizedBox(width: 10),
                Text('Correr'),
              ],
            ),
            SizedBox(height: 10),
            Row(
              children: [
                Icon(Icons.people),
                SizedBox(width: 10),
                Text('Interactuar con personas'),
              ],
            ),
            SizedBox(height: 10),
            Row(
              children: [
                Icon(Icons.event),
                SizedBox(width: 10),
                Text('Participar en eventos'),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
