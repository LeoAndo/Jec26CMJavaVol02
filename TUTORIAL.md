# Java基礎 Vol.02

標準出力、各種リテラル、算術演算、文字列連結を学ぶための授業用テキストです。

---

## 目次

1. [はじめに](#1-はじめに)
2. [実行方法](#2-実行方法)
3. [教材ファイル一覧](#3-教材ファイル一覧)
4. [学習内容](#4-学習内容)
5. [演習問題](#5-演習問題)

---

## 1. はじめに

### 1.1 前提条件

このテキストは、Java をこれから学び始める人を対象にしています。

**必要な知識**

- プログラミング経験は不要

**必要な環境**

- JDK 11 以上
- IntelliJ IDEA（Community Edition 可）

### 1.2 この教材で学ぶこと

この教材では、次の内容を段階的に確認します。

- Java プログラムの基本構造
- `System.out.print` と `System.out.println`
- 整数、浮動小数点、文字、真偽値、文字列のリテラル
- 算術演算子
- 文字列連結と式の評価順序
- コンパイルエラーになる書き方の例

### 1.3 学習目標

- 単一の Java ファイルをコンパイルして実行できる
- `print` と `println` の違いを説明できる
- 基本的なリテラルの書き方を理解する
- 算術演算と文字列連結の結果を予測できる

---

## 2. 実行方法

### 2.1 IntelliJ IDEA を使う場合

1. 実行したい `.java` ファイルを開く
2. `main` メソッドの左にある実行ボタンを押す
3. 下部のコンソールで結果を確認する

### 2.2 コマンドラインを使う場合

たとえば `Test0203.java` を実行する場合は、次のようにします。

```bash
javac src/Test0203.java
java -cp src Test0203
```

この教材には、あえてコンパイルエラーを発生させるためのファイルも含まれています。
そのため、基本的には 1 ファイルずつコンパイルして確認します。

---

## 3. 教材ファイル一覧

各ファイルは `public static void main(String[] args)` を持つ独立したプログラムです。

### 3.1 導入

| ファイル | 内容 |
|---------|------|
| `Main.java` | `Hello, World!` を表示する最初のプログラム |

### 3.2 標準出力とリテラル

| ファイル | 内容 |
|---------|------|
| `Test0201.java` | `print` を使った連続出力 |
| `Test0202.java` | `println` と `print` の違い |
| `Test0203.java` | 10進数、8進数、16進数の整数リテラル |
| `Test0204.java` | `long` リテラル |
| `Test0205.java` | 16進数リテラルと英字の大文字・小文字 |
| `Test0206.java` | 8進数で書けない値の例 |
| `Test0207.java` | 浮動小数点リテラルと接尾辞 |
| `Test0208.java` | 指数表記の実数リテラル |
| `Test0209.java` | `char` リテラル、エスケープ、Unicode |
| `Test0210.java` | `char` で 2 文字を書けない例 |
| `Test0211.java` | `boolean` リテラル |
| `Test0212.java` | 空文字列と改行 |
| `Test0213.java` | 文字列中の改行エスケープ |
| `Test0214.java` | 文字列中の `\"` が必要になる例 |
| `Test0215.java` | 文字列リテラル |

### 3.3 算術演算

| ファイル | 内容 |
|---------|------|
| `Arith01.java` | 整数の四則演算と余り |
| `Arith02.java` | 実数の四則演算と余り |
| `Arith03.java` | `double` と `int` を混在させた演算 |

### 3.4 文字列連結

| ファイル | 内容 |
|---------|------|
| `Concat01.java` | 文字列と数値の連結 |
| `Concat02.java` | 連結順序による結果の違い |
| `Concat03.java` | `int`、`char`、`String` の違い |

**補足**

- `Test0206.java`、`Test0207.java`、`Test0210.java`、`Test0214.java` には、教材用に **有効なコンパイルエラー例** が含まれています。
- 一部のファイルには、実行結果の目安がコメントで添えられています。

---

## 4. 学習内容

### 4.1 最初のプログラム

`Main.java` は最初に実行するためのプログラムです。

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

ポイント:

- `public class Main` はクラス宣言です
- `main` メソッドがプログラムの開始地点です
- `System.out.println` は文字列を表示して改行します

### 4.2 `print` と `println`

`Test0201.java` と `Test0202.java` で、出力の違いを確認できます。

`print` は改行しません。

```java
System.out.print("A");
System.out.print("B");
```

出力:

```text
AB
```

`println` は表示後に改行します。

```java
System.out.println("A");
System.out.print("B");
```

出力:

```text
A
B
```

### 4.3 リテラル

#### 整数リテラル

`Test0203.java` では、同じように見える数でも書き方によって意味が変わることを確認できます。

```java
System.out.println(12);
System.out.println(012);
System.out.println(0x12);
```

ポイント:

- `12` は 10 進数
- `012` は 8 進数
- `0x12` は 16 進数

#### 浮動小数点リテラル

`Test0207.java` と `Test0208.java` では、`double` や `float` の書き方を学びます。

```java
System.out.println(123.4);
System.out.println(123.4F);
System.out.println(4E2D);
```

`Test0207.java` には、`123.4L` が使えないことを示すコンパイルエラー例も入っています。

#### 文字リテラル

`Test0209.java` では、1 文字を表す `char` を扱います。

```java
System.out.println('A');
System.out.println('\n');
System.out.println('\u0041');
```

ポイント:

- 文字リテラルはシングルクォートで囲みます
- `'\n'` は改行を表すエスケープシーケンスです
- `'\u0041'` は Unicode エスケープです
- `Test0210.java` では、`char` で 2 文字を扱えないことをコンパイルエラーで確認できます

#### 真偽値と文字列

`Test0211.java` では `boolean`、`Test0215.java` では文字列リテラルを扱います。

```java
System.out.println(true);
System.out.println("TRUE");
```

- `true` は真偽値です
- `"TRUE"` は文字列です
- `Test0214.java` では、文字列中の `"` をそのまま書けないことをコンパイルエラーで確認できます

### 4.4 算術演算

`Arith01.java` から `Arith03.java` では、`+`、`-`、`*`、`/`、`%` を確認します。

```java
System.out.println(12 + 3);
System.out.println(12 - 14);
System.out.println(12 * 4);
System.out.println(12 / 4);
System.out.println(12 % 10);
```

ポイント:

- `/` は割り算です
- `%` は余りです
- `double` が入ると結果も実数になります

### 4.5 文字列連結

`Concat01.java` から `Concat03.java` では、`+` が文字列連結にも使われることを学びます。

```java
System.out.println("日本電子" + "専門学校");
System.out.println("abc" + 12 + 13);
System.out.println(12 + 13 + "abc");
```

ポイント:

- 文字列と数値を `+` でつなぐと文字列連結になります
- 左から順番に評価されるため、書く順序で結果が変わります
- `char` 同士の `+` は文字コードを使った数値計算になります

---

## 5. 演習問題

### 演習 1

`System.out.print` と `System.out.println` を使って、次のように表示するプログラムを作成してください。

```text
ABC
XYZ
```

### 演習 2

10進数、8進数、16進数でそれぞれ 10 を表す値を表示するプログラムを作成してください。

### 演習 3

整数の足し算、引き算、掛け算、割り算、余りを 1 行ずつ表示するプログラムを作成してください。

### 演習 4

次の式の結果を予想してから、実際にプログラムで確認してください。

```java
System.out.println("A" + 1 + 2);
System.out.println(1 + 2 + "A");
System.out.println('1' + '2');
```

---

## まとめ

この教材では、Java のごく基本的な書き方を実行例を通して確認しました。

- `main` メソッドを持つ独立したプログラムの形
- `print` と `println`
- 各種リテラルの書き方
- 算術演算
- 文字列連結

次は、変数や型を使ったより実践的なプログラムに進むと理解が深まります。
