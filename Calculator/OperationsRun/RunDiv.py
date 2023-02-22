from Calculator.OperationsInitializations.Div import Div
from Calculator.OperationsRun.Run import Run
from Calculator.MVP.View import View


class RunDiv(Run):

    def run_operation(self):
        view = View()
        div = Div()
        x = view.get_value("Введите x: ")
        y = view.get_value("Введите y: ")
        res = div.result(x, y)
        view.show(res, "Div : ")
