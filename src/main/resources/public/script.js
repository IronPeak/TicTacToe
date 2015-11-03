game = {};

$(document).ready(function() {
  
  game.getBoard();
  setInterval(game.getBoard, 1000);

  $('.box').on('click', function(event) {
    game.updateBoard(this);
    game.getPlayer();
    game.isWinner();
  });

  $('#restart').on('click', function(event) {
    game.restart();
  });

});

game.getBoard = function() {
  $.ajax({
    type: 'get',
    url: '/getBoard'
    }).done(function(response) {
      game.setBoard(response);
      game.getPlayer();
      game.isWinner();
    }).fail(function(err) {
      $('#error')
        .text('setting the board failed!')
        .show();
  });
}

game.isWinner = function() {
  $.ajax({
    type: 'get',
    url: '/isWinner',
    data: null
    }).done(function(response) {
      if (response != '0') {
        game.displayWinner(response);
      };
    }).fail(function(err) {
      $('#error')
        .text('there was a prolem when finding the winner!')
        .show();
  });
}

game.displayWinner = function(winner) {
  if (winner == "1") {
    $('#winner').text('player 1 is the winner!');
  } else if (winner == "2") {
    $('#winner').text('player 2 is the winner!');
  } else if (winner == "3") {
    $('#winner').text("it's a tie!");
  };
}

game.restart = function() {
  $.ajax({
    type: 'post',
    url: '/restart'
    }).done(function(response) {
      game.setBoard(response);
      game.getPlayer();
    }).fail(function(err) {
      $('#error')
        .text('restart failed!')
        .show();
  });
}

game.updateBoard = function(box) {
  $('#winner').text('');
  var id = $(box).find('button').attr('id');
  var position = id.charAt(id.length - 1);

  $.ajax({
    type: 'post',
    url: '/setBox',
    data: {
      "position" : position
    }
    }).done(function(response) {
        game.setBoard(response);
    }).fail(function(err) {
      $('#error')
        .text('updating the board failed!')
        .show();
  });
}

game.getPlayer = function() {
  $.ajax({
    type: 'get',
    url: '/getPlayer'
    }).done(function(response) {
        $('#player').text(response);
    }).fail(function(err) {
      $('#error')
        .text('finding the correct player failed!')
        .show();
  });
}

game.setBoard = function(boardState) {
  $.each($('.box'), function(index) {
    $(this).find('button').removeClass('empty player-X player-O');
    switch(boardState.charAt(index)) {
      case '0':
        $(this).find('button').addClass('empty');
        break;
      case '1':
        $(this).find('button').addClass('player-X');
        break;
      case '2':
        $(this).find('button').addClass('player-O');
        break;
    }
  });
};
