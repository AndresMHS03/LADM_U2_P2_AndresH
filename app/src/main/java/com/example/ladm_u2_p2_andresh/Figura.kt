package com.example.ladm_u2_p2_andresh

import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent
import kotlin.math.round

class Figura() {

    var x =0f
    var y=0f
    var radio=0f
    var lado = 0f
    var incx = 0f
    var incy = 0f

    constructor(x:Int,y:Int,radio:Int) : this() {
        this.x=x.toFloat()
        this.y=y.toFloat()
        this.radio = radio.toFloat()
        this.lado = (radio*2).toFloat()
        incx = round(((1/this.radio)*300))
        incy = round(((1/this.radio)*300))
    }


    fun pintar(c:Canvas,p:Paint){
        c.drawCircle(x,y,radio,p)
    }

    fun estaEnArea(event:MotionEvent):Boolean{
        if(event.x>=x-radio && event.x<=x+radio){
            if(event.y>=y-radio && event.y<=y+radio){
                return true
            }
        }
        return false
    }

    fun rebote(alto:Int, ancho:Int){
        x+= incx
        if(x<= 0||x+this.lado>=ancho){
            incx*=-1
        }
        y+=incy
        if(y<=0||y+this.lado>=alto){
            incy*=-1
        }
    }
}