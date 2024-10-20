public class Browser {
     public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip){
        return "<html></html>";
    }
    private String findIpAddress (String address) {
        return "127.0.0.1";
    }
}

//Main codes

//var browser = new Browser();
//        browser.navigate("www.promise.vercel.app");
