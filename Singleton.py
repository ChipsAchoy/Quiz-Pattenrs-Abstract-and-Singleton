class Singleton:
    _instance = None

    def getInstance():
        if Singleton._instance == None:
            Singleton()
            return Singleton._instance

    def __init__(self):
        if Singleton._instance != None:
            Exception("Singleton Created")
        else:
            Singleton._instance = self


s = Singleton()
print(s)

s = Singleton.getInstance()
print(s)

s = Singleton.getInstance()
print(s)
