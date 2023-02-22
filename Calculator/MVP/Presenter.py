from Calculator.MVP.Model import Model
from Calculator.MVP.View import View


class Presenter:
    view = View()
    model = Model()

    def __init__(self, model, view):
        self.model = model
        self.view = view

    def button_click(self):
        self.model.run()
