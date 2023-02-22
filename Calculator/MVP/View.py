class View:

    def get_value(self, data):
        print(data)
        user_inp = int(input())
        return user_inp

    def show(self, value, data):
        print(f"{data}{value}")
