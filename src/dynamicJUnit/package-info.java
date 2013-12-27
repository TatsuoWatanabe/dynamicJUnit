/**
 * <blockquote>
 *   <p>大きなルーチンが正しく動作していると確認するにはどうしたらよいだろうか? 確認する人物に多大な負担をかけないようにするには、プログラムの全体としての正しさを容易に確認できるようプログラマが個別に確認可能な明確な「表明」(<a href="http://ja.wikipedia.org/wiki/%E8%A1%A8%E6%98%8E">assertions</a>) をいくつもするべきである。</p>
 *   <cite>
 *     -- <a href="http://ja.wikipedia.org/wiki/%E3%82%A2%E3%83%A9%E3%83%B3%E3%83%BB%E3%83%81%E3%83%A5%E3%83%BC%E3%83%AA%E3%83%B3%E3%82%B0">アラン・チューリング</a>
 *   </cite>
 * </blockquote>
 *
 * <h3>参考API</h3>
 * <dl>
 *   <dt>Selenium</dt>
 *   <dd><a href="http://selenium.googlecode.com/git/docs/api/java/index.html" target="_blank">Selenium Java API document</a></dd>
 *   <dt>JUnit</dt>
 *   <dd><a href="http://junit-team.github.io/junit/javadoc/latest/index.html" target="_blank">JUnit</a></dd>
 *   <dt>Hamcrest</dt>
 *   <dd><a href="http://hamcrest.org/JavaHamcrest/javadoc/1.3/" target="_blank">Hamcrest - library of matchers for building test expressions</a></dd>
 *   <dt>JAVA 7</dt>
 *   <dd><a href="http://docs.oracle.com/javase/jp/7/api/" target="_blank">コア API ドキュメント(日本語)</a></dd>
 *   <dd><a href="http://download.oracle.com/javase/7/docs/api/" target="_blank">コア API ドキュメント(英語)</a></dd>
 *   <dd><a href="http://docs.oracle.com/javase/jp/7/" target="_blank">JDK プログラマーズ・ガイド(日本語)</a></dd>
 *   <dd><a href="http://download.oracle.com/javase/7/docs/" target="_blank">JDK プログラマーズ・ガイド(英語)</a></dd>
 *   <dt>JAVA 6</dt>
 *   <dd><a href="http://docs.oracle.com/javase/jp/6/api/" target="_blank">コア API ドキュメント(日本語)</a></dd>
 *   <dd><a href="http://download.oracle.com/javase/6/docs/api/" target="_blank">コア API ドキュメント(英語)</a></dd>
 *   <dd><a href="http://gceclub.sun.com.cn/Java_Docs/jdk6/html/zh_CN/api/index.html" target="_blank">コア API ドキュメント(中国語)</a></dd>
 * </dl>
 *
 * <script>
 *   var rnd = function(i) { return Math.floor(Math.random() * i);};
 *   var quotes = [
 *       { quote: '製品をデザインするのはとても難しい。多くの場合、人は形にして見せてもらうまで自分は何が欲しいのかわからないものだ', name: 'スティーブ・ジョブズ' },
 *       { quote: 'プログラミングの進展をコードの行数で測るのは、飛行機建造の進展を重量で測るようなものだ。', name: 'ビル・ゲイツ' },
 *       { quote: '実のところ、すべてを備えていない言語のほうがプログラミングは簡単である。', name: 'デニス・リッチー' },
 *       { quote: 'もしそれがよい考えなら、思い切ってそれをしなさい。許可をもらうよりも、謝るほうが簡単だから。', name: 'グレース・ホッパー' },
 *       { quote: 'プログラムを書くのが好きじゃなかったから、プログラムを簡単に書けるシステムを考えたのです。', name: 'ジョン・バッカス' },
 *       { quote: '人が知らないことを自分は知っていると思ってはいけない。いつだってもっと頭の切れる人がいるものだ。ひょっこりと現れて、自分よりいいアルゴリズムを考え出したり、もっと簡単に仕事をする方法を思いついたりするんだ。', name: 'ジョン・ワーノック' },
 *       { quote: '困難のために会社を辞めたことはあっても、プロジェクトを止めたことはない。いつもPythonのプロジェクトは次の会社で続けていた。', name: 'グイド・ヴァンロッサム' },
 *       { quote: 'シンプルであれ。', name: 'ジェームズ・ゴスリン' }
 *   ];
 *   window.onload = function () {
 *       var obj = quotes[rnd(quotes.length)];
 *       var p = document.getElementById('quote');
 *       var a = document.getElementById('quote-link');
 *       p.innerHTML = obj.quote;
 *       a.innerHTML = obj.name;
 *       a.href = 'http://ja.wikipedia.org/wiki/' + encodeURIComponent(obj.name);
 *   };
 * </script>
 *
 * <h3>参考名言</h3>
 * <blockquote>
 *   <p id="quote"></p>
 *   <cite>
 *     -- <a id="quote-link"></a>
 *   </cite>
 * </blockquote>
 */
package dynamicJUnit;