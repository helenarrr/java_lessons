from Calculator.OperationsRun.ResultOperation import ResultOperation


class Sum(ResultOperation):
    def result(self, x, y):
        return x + y
