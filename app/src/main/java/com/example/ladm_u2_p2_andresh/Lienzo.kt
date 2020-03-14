package com.example.ladm_u2_p2_andresh

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity): View(p) {
    var puntero = p

    var burbuja1 = Figura(350,200,15)
    var burbuja2 = Figura(500,1000,50)
    var burbuja3 = Figura(10,715,25)
    var burbuja4 = Figura(620,1540,72)
    var burbuja5 = Figura(100,0,140)
    var burbuja6 = Figura(800,410,5)
    var burbuja7 = Figura(290,2000,47)
    var burbuja8 = Figura(841,347,89)
    var burbuja9 = Figura(153,741,38)
    var burbuja10 = Figura(751,810,100)


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        var paint = Paint()

        canvas!!.drawColor(Color.BLACK)

        paint.color = Color.RED
        burbuja1.pintar(canvas,paint)

        paint.color = Color.GREEN
        burbuja2.pintar(canvas,paint)

        paint.color = Color.BLUE
        burbuja3.pintar(canvas,paint)

        paint.color = Color.MAGENTA
        burbuja4.pintar(canvas,paint)

        paint.color = Color.DKGRAY
        burbuja5.pintar(canvas,paint)

        paint.color = Color.GRAY
        burbuja6.pintar(canvas,paint)

        paint.color = Color.YELLOW
        burbuja7.pintar(canvas,paint)

        paint.color = Color.WHITE
        burbuja8.pintar(canvas,paint)

        paint.color = Color.LTGRAY
        burbuja9.pintar(canvas,paint)

        paint.color = Color.CYAN
        burbuja10.pintar(canvas,paint)
    }

    fun animar(){
        burbuja1.rebote(height,width)
        burbuja2.rebote(height,width)
        burbuja3.rebote(height,width)
        burbuja4.rebote(height,width)
        burbuja5.rebote(height,width)
        burbuja6.rebote(height,width)
        burbuja7.rebote(height,width)
        burbuja8.rebote(height,width)
        burbuja9.rebote(height,width)
        burbuja10.rebote(height,width)

        invalidate()
    }
}