import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Contador de Puntos',
      theme: ThemeData.dark(), // fondo oscuro
      home: PuntoPage(),
    );
  }
}

class PuntoPage extends StatefulWidget {
  @override
  _PuntoPageState createState() => _PuntoPageState();
}

class _PuntoPageState extends State<PuntoPage> {
  int puntos = 0;

  void sumar() {
    setState(() {
      puntos++;
    });
  }

  void restar() {
    setState(() {
      puntos--;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black, // fondo negro
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              'Puntos: $puntos',
              style: TextStyle(fontSize: 32, color: Colors.white),
            ),
            const SizedBox(height: 30),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                ElevatedButton(
                  onPressed: sumar,
                  style: ElevatedButton.styleFrom(
                    backgroundColor: Colors.green,
                    padding: EdgeInsets.symmetric(horizontal: 24, vertical: 12),
                  ),
                  child: Text('Suma puntos'),
                ),
                const SizedBox(width: 20),
                ElevatedButton(
                  onPressed: restar,
                  style: ElevatedButton.styleFrom(
                    backgroundColor: Colors.red,
                    padding: EdgeInsets.symmetric(horizontal: 24, vertical: 12),
                  ),
                  child: Text('Resta puntos'),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
