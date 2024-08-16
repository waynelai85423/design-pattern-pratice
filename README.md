# design-pattern-pratice

### 1.工廠模式
* 解耦合：將物件的建立與使用分離，無需了解特定的類，只需知道工廠類別提供的介面即可。
* 提高可擴展性：新增新的產品類時，只需擴展工廠類或建立新的工廠類，而不需要修改現有的程式碼。
* 簡化程式碼：透過工廠模式，程式碼中的實例化邏輯集中在一個地方，避免在多個地方重複程式碼。
* 如果要複製相似的物件，或創建物件的步驟繁雜時，可以把創建邏輯封裝在工廠類，如果物件有很多子類別時，也可以把要實例化哪一個子類邏輯寫在工廠類，之後如果要修改邏輯時，直接在工廠類修改，或是新增一個工廠類，減少代碼重複性，和增加代碼擴充性和維護性。

### 2.單例模式
* 單一實例模式確保系統中只存在一個類別的實例，避免了重複建立物件帶來的資源浪費。
*  配置管理：系統配置類別通常是單例，這樣確保可以程式的所有部分存取和修改是同一個配置實例。
*  資料庫連線池：資料庫連線池類型通常為單例，以控制資料庫連線的建立數量，並進行連線重複使用。