package demo

import javafx.scene.Parent
import tornadofx.View
import tornadofx.hbox
import tornadofx.label

class MainView() : View() {
    override val root = hbox {
        label("heloo")
    }

}