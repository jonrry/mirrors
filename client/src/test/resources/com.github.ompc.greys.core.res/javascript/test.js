require({
    paths: {
        stringjs: 'https://raw.githubusercontent.com/jprichardson/string.js/master/dist/string.min.js',
        moment: 'https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js',
        // moment: '/tmp/moment.js',
        'text-formatting': '/Users/vlinux/IdeaProjects/github/greys-project/greys-anatomy/scripts/text-formatting-module.js',
        'sql-formatter': 'https://raw.githubusercontent.com/sonota88/anbt-sql-formatter.js/master/anbt-sql-formatter.js',
        'echo': '/tmp/echo.js',
        'stats': '/Users/vlinux/IdeaProjects/github/greys-project/greys-anatomy/scripts/stream-statistics-module.js',
        //'timer': '/Users/vlinux/IdeaProjects/github/greys-project/greys-anatomy/scripts/timer-module.js',
        'common-lang': '/Users/vlinux/IdeaProjects/github/greys-project/greys-anatomy/scripts/common-lang-module.js',
        'scheduler': '/Users/vlinux/IdeaProjects/github/greys-project/greys-anatomy/scripts/scheduler-module.js',
    }
})

/**
 * 定义了一个console模块
 * 简单实现,不要吐槽
 */
define('console', function () {

    function print(string) {
        java.lang.System.out.print("" + string);
    }

    function println(string) {
        print(string + '\n');
    }

    return {
        log: function (msg) {
            println(msg);
        }
    }
})

//require(['console'],function(console){
//
//    var m = {};
//    m['fuck'] = 1;
//    m['suck'] = 2;
//    m['shit'] = 3;
//
//    for(var p in m) {
//        console.log(p);
//    }
//
//    console.log(/^com\.mysql\.jdbc\.PreparedStatement$/.test('com.mysql.jdbc.JDBC4PreparedStatement'))
//
//})
//
//require(['stats', 'console'], function (stats, console) {
//
//    // var t1 = new stat(['sum', 'avg', 'min', 'max']);
//
//    var t1 = stats.create([
//        stats.SUM,
//        stats.AVG,
//        stats.MIN,
//        stats.MAX,
//        stats.COUNT,
//        stats.SUM,
//        stats.SUM,
//        stats.SUM,
//        stats.SUM,
//        stats.SUM,
//    ]);
//
//    for (var i = 0; i < 100; i++) {
//        t1.stats(1, 2.2, 3, 4, 5, 6, 7, 8, 9, 10);
//    }
//
//    var report = t1.stats();
//    for (var index in report) {
//        var data = report[index];
//        console.log("index=" + index + ";data=" + data);
//    }
//
//})
//
//
function test() {


    __greys_require(['common-lang', 'console', 'scheduler'], function (lang, console, scheduler) {

        var c = 0;

        //console.log(lang.java.field.get(javaClass, javaObject, fieldName));
        //
        //if (lang.java.clazz.isJava(javaObject)
        //    && lang.java.field.has(javaClass, javaObject, fieldName)) {
        //    console.log(lang.java.field.get(javaClass, javaObject, fieldName));
        //}

        var date = new Date();

        console.log(lang.date.format(date, 'yyyy-MM-dd hh:mm:ss.S'));
        var test = /^FUCK$/;
        console.log({} instanceof Object);

        //while (c <= 5) {
        //    schedule.shutdown();
        //    console.log("shutdown");
        //}

    })

}

var number = 0;
var lock;
require(['common-lang'], function (lang) {
    lock = new lang.lock();
})

function inc() {
    lock.lock();
    try {
        number++;
    } finally {
        lock.unlock();
    }
}

function get() {
    return number;
}

//
////require(['common-lang', 'console'], function (lang, console) {
////
////    var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
////    lang.array.remove(arr, 6);
////
////    lang.array.forEach(arr, function (index, e) {
////        console.log('index=' + index + ";e=" + e);
////    });
////
////    console.log(lang.array.contains(arr, 9));
////    console.log(lang.array.contains(arr, 6));
////
////    console.log("=====" + lang.array.contains(['top', 'left', 'right', 'bottom'], 'top'))
////
////})
//
//
////
//require(['text-formatting'], function (text) {
//    var box = text.box('abcdefg');
//    box.config({
//        borders: ['top', 'bottom', 'left', 'right'],
//        padding: 1,
//    });
//    java.lang.System.out.println(box.rendering());
//})
////
//require(['text-formatting'], function (text) {
//    var table = new text.table();
//    table.config({
//        borders: ['top', 'bottom', 'left', 'right', 'vertical', 'horizontal'],
//        padding: 1,
//        columns: [
//            {
//                width: 10,
//                vertical: 'middle',
//                horizontal: 'left'
//            },
//            {
//                width: 20,
//                vertical: 'bottom',
//                horizontal: 'right'
//            },
//            {
//                width: 10,
//                vertical: 'top',
//                horizontal: 'middle'
//            }
//        ]
//    });
//
//    table.row('abcdefghijklmnopqrstabcdefghijklmnox', '12345678901234567890', '!@#$%^&*()_++_)(*&^%$#@!!@#$%^&*()_++_)(*&^%$#@!');
//    table.row('abcdefghijklmnopqrst', '12345678901234567890', '!@#$%^&*()_++_)(*&^%$#@!!@#$%^&*()_++_)(*&^%$#@!');
//    table.row('abcdefghijklmnopqrstabcdefghijklmnox', '12345678901234567890', '!@#$%^&*()_++_)(*&^%$#@!!@#$%^&*()_++_)(*&^%$#@!');
//    table.row('abcdefghijklmnopqrst', '12345678901234567890', '!@#$%^&*()_++_)(*&^%$#@!!@#$%^&*()_++_)(*&^%$#@!');
//
//    java.lang.System.out.println(table.rendering());
//
//})

//require(['sql-formatter'], function (asf) {
//    var rule = new asf.anbtSqlFormatter.Rule();
//    rule.functionNames.push("DATE");
//    rule.kw_minus1_indent_nl_kw_plus1_indent.push("LIMIT");
//    var formatter = new asf.anbtSqlFormatter.Formatter(rule);
//    java.lang.System.out.println(formatter.format('select `lg_order_goods`.`ORDER_GOODS_ID`,`lg_order_goods`.`ORDER_ID`,`lg_order_goods`.`GOODS_NAME`,`lg_order_goods`.`GOODS_PIC_ID`,`lg_order_goods`.`GOODS_QUANTITY`,`lg_order_goods`.`SELL_PROPERTY`,`lg_order_goods`.`PACKAGE_NAME`,`lg_order_goods`.`GOODS_STATUS`,`lg_order_goods`.`AUCTION_CODE`,`lg_order_goods`.`GMT_CREATE`,`lg_order_goods`.`GMT_MODIFIED`,`lg_order_goods`.`ITEM_VALUE`,`lg_order_goods`.`TRADE_ID`,`lg_order_goods`.`USER_ID`,`lg_order_goods`.`PICKING_ID`,`lg_order_goods`.`FEATURE`,`lg_order_goods`.`SYNC_VERSION` from `lg_order_goods_0838` `lg_order_goods` where ((`lg_order_goods`.`USER_ID` = ?) AND (`lg_order_goods`.`ORDER_ID` = ?)) limit ?,?'));
//})
//
//require(['echo'],function(echo){
//    java.lang.System.out.println(echo.echo('hello'));
//});


//require({
//    paths: {
//        json: 'http://cdnjs.cloudflare.com/ajax/libs/json3/3.3.2/json3.min.js',
//        stream: 'http://cdn.jsdelivr.net/stream.js/latest/stream.min.js',
//    }
//})
//
///**
// * 定义了一个console模块
// * 简单实现,不要吐槽
// */
//define('console', function () {
//
//    function print(string) {
//        java.lang.System.out.print("" + string);
//    }
//
//    function println(string) {
//        print(string + '\n');
//    }
//
//    return {
//        log: function (msg) {
//            println(msg);
//        }
//    }
//})
//
//require(['json', 'stream', 'console'], function (json, stream, console) {
//
//    var s = stream.make(
//        {
//            name: 'vlinux',
//            email: 'oldmanpushcart@gmail.com',
//        },
//        {
//            name: 'dukun',
//            email: 'dukun@taobao.com',
//        }
//    );
//
//    while (!s.empty()) {
//        console.log(json.stringify(s.head()));
//        s = s.tail();
//    }
//})


